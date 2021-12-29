package com.zhengcj.webdemo.annotation;

import java.lang.annotation.*;

/**
 * @author zhengcj
 * @create 2021-12-22 14:28
 * @description  AOP日志记录 自定义注解类
 *
 * https://mp.weixin.qq.com/s/Nl_U6Tfood_NgtONcZvSdg
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemCrmlog {
    /**
     * 日志描述
     * 对于什么表格进行了什么操作
     */
    String description()  default "";

    /**
     * 操作了的表名
     * @return
     */
    String  tableName() default "";
}
