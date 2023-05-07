package org.springframework.lcyj.postProcess.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lcyj.postProcess.bfpp.MyBeanFactoryPostProcess;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	@Override
	public void addBeanFactoryPostProcessor(BeanFactoryPostProcessor postProcessor) {
		super.addBeanFactoryPostProcessor(postProcessor);

	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// 方式2：通过addBeanFactoryPostProcessor将BeanFactoryPostProcess添加到Spring
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcess());
		super.customizeBeanFactory(beanFactory);
	}

	public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}
}
