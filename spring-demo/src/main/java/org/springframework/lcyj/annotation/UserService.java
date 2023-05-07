package org.springframework.lcyj.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.lcyj.models.User;
import org.springframework.stereotype.Component;

@Component
@Import(value = User.class)
@Configuration
public class UserService {
}
