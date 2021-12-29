package com.zhengcj.webdemo.annotation;

import java.lang.annotation.*;

/**
 * @author zhengcj
 * @create 2021-12-16 16:10
 * @description
 */
// 声明注解的保留期限
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface NeedTest {
    // 声明注解成员
    boolean value() default false;
}
