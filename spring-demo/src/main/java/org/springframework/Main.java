package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lcyj.factorybean.UserServiceFactoryBean;
import org.springframework.lcyj.models.User;
import org.springframework.lcyj.postProcess.beanFactory.MyClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String xmlPath = "classpath*:application.xml";
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext(xmlPath);
//		UserService userService = (UserService)applicationContext.getBean("userService");
//		userService.add();
		User user = (User)applicationContext.getBean("user");
		System.out.println(user);
		// FactoryBean
//		User user = (User)applicationContext.getBean("userServiceFactoryBean");
//		System.out.println(user);

		UserServiceFactoryBean userServiceFactoryBean = (UserServiceFactoryBean)applicationContext.getBean("&userServiceFactoryBean");
		System.out.println(userServiceFactoryBean);
		System.out.println(Integer.MIN_VALUE);
	}
}