package org.springframework.lcyj.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lcyj.models.User;

public class UserServiceFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
