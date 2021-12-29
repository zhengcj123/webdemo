package com.zhengcj.webdemo.Transactional;

import com.zhengcj.webdemo.service.FactoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhengcj
 * @create 2021-12-29 11:01
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {

    @Resource
    private FactoryService factoryService;

    @Test
    public void deleteTest() {
        factoryService.updateFactory("1465881113006718978");
    }

}
