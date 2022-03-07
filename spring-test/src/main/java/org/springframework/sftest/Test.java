package org.springframework.sftest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// @sf 测试入口
		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("application.xml");


	}


}
