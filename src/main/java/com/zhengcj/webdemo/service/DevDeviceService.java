package com.zhengcj.webdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhengcj.webdemo.annotation.SystemCrmlog;
import com.zhengcj.webdemo.entity.po.DevDevicePO;

/**
 * @author zhengcj
 * @create 2021-09-27 18:14
 * @description
 */
public interface DevDeviceService  extends IService<DevDevicePO> {


    DevDevicePO testSystemCrmlog(Integer deviceId);

    @SystemCrmlog(description = "测试异常日志", tableName = "dev_device")
    DevDevicePO testExceptionSystemCrmlog(Integer deviceId) throws Exception;
}
