package org.springframework.lcyj.postProcess.bdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.lcyj.models.User;

public class MyBeanDefinitionRegistorPostProcess implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行了MyBeanDefinitionRegistorPostProcess.postProcessBeanFactory--》");
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		user.setDescription("用户信息");


	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行了MyBeanDefinitionRegistorPostProcess.postProcessBeanDefinitionRegistry--》");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
		builder.addPropertyValue("userName", "张三");
		registry.registerBeanDefinition("user",builder.getBeanDefinition());
	}
}
