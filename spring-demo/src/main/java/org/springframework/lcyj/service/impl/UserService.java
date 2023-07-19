package org.springframework.lcyj.service.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.lcyj.models.User;
import org.springframework.lcyj.service.IUserService;
import org.springframework.stereotype.Component;

@Component
@Import(value = User.class)
@Configuration
public class UserService implements IUserService {

	@Override
	public void add() {
		System.out.println("=============添加新用户");
	}
}
