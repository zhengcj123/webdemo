package com.zhengcj.webdemo.init;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class IdComponent implements InitializingBean {


    public Snowflake snowflake;

    @Override
    public void afterPropertiesSet() throws Exception {
        snowflake = IdUtil.getSnowflake(1L, 1L);
    }

    public Snowflake snowflake() {
        return snowflake;
    }
}
