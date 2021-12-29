package com.zhengcj.webdemo.aspet;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationTestAspect {

	@AfterReturning("@annotation(com.zhengcj.webdemo.annotation.NeedTest)")
	public void needTest() {
		System.out.println("needTest() executed,some logic is here");
	}

}