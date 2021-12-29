package com.zhengcj.webdemo.annotation;

import com.zhengcj.webdemo.entity.po.DevDevicePO;
import com.zhengcj.webdemo.service.DevDeviceService;
import com.zhengcj.webdemo.service.impl.DevDeviceServiceImpl;
import com.zhengcj.webdemo.service.impl.NaiveWaiter;
import com.zhengcj.webdemo.service.impl.NaughtWaiter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


/**
 * 地址：https://blog.csdn.net/yangshangwei/article/details/77619875?utm_source=blogxgwz6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotTests {

    @Autowired
    private NaiveWaiter naiveWaiter;
    @Autowired
    private NaughtWaiter naughtWaiter;

    @Resource
    private DevDeviceService deviceService;

    @Test
    public void Test01() {
        naiveWaiter.greetTo("aaaaaaaaaa");
        naiveWaiter.serverTo("=====aaaaaaaaa====");
        naughtWaiter.greetTo("aaaaaaaaaa");
        naughtWaiter.serverTo("=====aaaaaaaaa====");
    }

    @Test
    public void testSystemLog(){
        DevDevicePO po = deviceService.testSystemCrmlog(1);
        System.out.println(po);
    }

    @Test
    public void testExceptionSystemLog() {
        DevDevicePO po = null;
        try {
            po = deviceService.testExceptionSystemCrmlog(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(po);
    }




}
