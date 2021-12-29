package com.zhengcj.webdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengcj.webdemo.entity.po.FactoryPO;
import com.zhengcj.webdemo.mapper.FactoryMapper;
import com.zhengcj.webdemo.service.FactoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * desc: 组织机构表 业务接口实现类
 *
 * @author zhengcj
 * date: 2021-11-30 10:40:45
 */
@Slf4j
@Service
public class FactoryServiceImpl extends ServiceImpl<FactoryMapper, FactoryPO> implements FactoryService {

    @Override
    public void updateFactory(String factoryId) {
        lambdaUpdate().eq(FactoryPO::getId, factoryId)
                .set(FactoryPO::getDisplayd, Boolean.FALSE)
                .update();
        deleteFactory(factoryId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteFactory(String factoryId) {
        removeById(factoryId);
        String str = null;
        str.equals(factoryId);
    }


}