package com.zhengcj.webdemo.service;

import cn.hutool.json.JSONUtil;
import com.zhengcj.webdemo.entity.po.DevDevicePO;
import com.zhengcj.webdemo.service.DevDeviceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeviceTests {

    @Autowired
    private DevDeviceService deviceService;

    @Test
    public void testMybatisPlus(){
        DevDevicePO po = deviceService.getById(1);
        System.out.println(po);
    }






}
