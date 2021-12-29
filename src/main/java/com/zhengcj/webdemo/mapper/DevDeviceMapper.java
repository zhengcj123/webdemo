package com.zhengcj.webdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhengcj.webdemo.entity.po.DevDevicePO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 设备表 Mapper 接口
 * </p>
 *
 * @author zhengcj
 * @since 2021-09-08
 */
@Mapper
public interface DevDeviceMapper extends BaseMapper<DevDevicePO> {

}
