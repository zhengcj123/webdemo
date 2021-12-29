package com.zhengcj.webdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhengcj.webdemo.entity.po.FactoryPO;
import org.apache.ibatis.annotations.Mapper;


/**
* desc: mapper
*
* @author zhengcj
* date: 2021-11-30 10:40:45
*/
@Mapper
public interface FactoryMapper extends BaseMapper<FactoryPO> {

}