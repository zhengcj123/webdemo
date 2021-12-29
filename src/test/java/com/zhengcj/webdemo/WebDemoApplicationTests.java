package com.zhengcj.webdemo;

import cn.hutool.core.io.resource.ClassPathResource;
import com.zhengcj.webdemo.entity.po.DevDevicePO;
import com.zhengcj.webdemo.service.DevDeviceService;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebDemoApplicationTests {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Autowired
    private StringEncryptor encryptor;

    @Autowired
    private DevDeviceService deviceService;

    @Test
    public void testMybatisPlus(){
        DevDevicePO po = deviceService.getById(1);
        System.out.println(po);
    }


    @Test
    public void encryptTest() {
        String url = encryptor.encrypt("jdbc:mysql://192.168.3.60:3307/wiswater-new?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println("database url: " + url);
        System.out.println("database name: " + name);
        System.out.println("database password: " + password);
    }



    @Test
    public void testEncryptorTest() {
        System.out.println("url:"+url); // 123456
        System.out.println("username:"+username); // 123456
        System.out.println("password:"+password); // 123456
        ClassPathResource resource = new ClassPathResource("application.yml");
        Properties properties = new Properties();
        try {
            properties.load(resource.getStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.get("url")); // ENC(Amh/EY0/cBdyaE094b8CBA==)
    }

}
