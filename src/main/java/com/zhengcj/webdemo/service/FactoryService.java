package com.zhengcj.webdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhengcj.webdemo.entity.po.FactoryPO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
* desc: 组织机构表(树状的组织:集团-分区-工厂) 业务接口
*
* @author zhengcj
* date: 2021-11-30 10:40:45
*/
public interface FactoryService extends IService<FactoryPO>{

    /**
     * 删除工厂
     * @param factoryId
     */
    void deleteFactory(String factoryId) throws Exception;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    void updateFactory(String factoryId);
}