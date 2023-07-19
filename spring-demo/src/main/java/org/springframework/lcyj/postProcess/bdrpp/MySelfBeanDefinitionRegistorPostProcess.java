package org.springframework.lcyj.postProcess.bdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

public class MySelfBeanDefinitionRegistorPostProcess implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行postProcessBeanFactory---MySelfBeanDefinitionRegistorPostProcess");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行postProcessBeanDefinitionRegistry---MySelfBeanDefinitionRegistorPostProcess");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
