package com.zhengcj.webdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengcj.webdemo.annotation.SystemCrmlog;
import com.zhengcj.webdemo.entity.po.DevDevicePO;
import com.zhengcj.webdemo.mapper.DevDeviceMapper;
import com.zhengcj.webdemo.service.DevDeviceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author zhengcj
 * @create 2021-09-27 18:15
 * @description
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DevDeviceServiceImpl extends ServiceImpl<DevDeviceMapper, DevDevicePO> implements DevDeviceService {

    @Override
    @SystemCrmlog(description = "测试日志", tableName = "dev_device")
    public DevDevicePO testSystemCrmlog(Integer deviceId){
        try { TimeUnit.SECONDS.sleep(5L); } catch (InterruptedException e) { e.printStackTrace(); }
        return getById(deviceId);
    }

    @Override
    @SystemCrmlog(description = "测试异常日志", tableName = "dev_device")
    public DevDevicePO testExceptionSystemCrmlog(Integer deviceId) throws Exception {
        if(deviceId == 1){
            throw new Exception("测试异常");
        }
        return getById(deviceId);
    }

}
