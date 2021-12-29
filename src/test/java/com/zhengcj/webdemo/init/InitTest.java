package com.zhengcj.webdemo.init;

import com.zhengcj.webdemo.entity.po.DevDevicePO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhengcj
 * @create 2021-12-27 15:13
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Import(DevDevicePO.class)
@Import(MyImportSelector.class)
public class InitTest {
    @Resource
    private IdComponent idComponent;

    @Resource
    private DevDevicePO devicePO;

    @Test
    public void testId(){
        String s = idComponent.snowflake.nextIdStr();
        System.out.println(s);
    }

    @Test
    public void testImport(){
        System.out.println(devicePO);
    }
}

class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zhengcj.webdemo.entity.po.DevDevicePO"};
    }
}
