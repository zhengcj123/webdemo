package com.zhengcj.webdemo.service.impl;

import com.zhengcj.webdemo.annotation.NeedTest;
import com.zhengcj.webdemo.service.Waiter;
import org.springframework.stereotype.Service;

@Service
public class NaiveWaiter implements Waiter {

	@NeedTest(true)
	@Override
	public void greetTo(String clientName) {
//		System.out.println("NaiveWaiter:greet to " + clientName);
	}

	@Override
	public void serverTo(String clientName) {
//		System.out.println("NaiveWaiter:server to " + clientName);
	}

	public void smile(String clientName, int times) {
		System.out.println("NaiveWaiter:smile to  " + clientName + " " + times
				+ " times");
	}
}