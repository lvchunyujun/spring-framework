package org.springframework.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.service.UserService;

public class UserServiceFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}
}
