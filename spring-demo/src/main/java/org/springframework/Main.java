package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.factorybean.UserServiceFactoryBean;
import org.springframework.service.UserService;

public class Main {
	public static void main(String[] args) {
		String xmlPath = "application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//		UserService userService = (UserService)applicationContext.getBean("userService");
//		userService.add();
		// FactoryBean
		UserService userService = (UserService)applicationContext.getBean("userServiceFactoryBean");
		System.out.println(userService);
		userService.add();

		UserServiceFactoryBean userServiceFactoryBean = (UserServiceFactoryBean)applicationContext.getBean("&userServiceFactoryBean");
		System.out.println(userServiceFactoryBean);
	}
}