package org.springframework.lcyj.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 如果不加 @Configuration 则不会走ComponentScan扫描
 */
@Configuration
@ComponentScan(basePackages="org.springframework.lcyj.service.*")
public class MyComponentScan {

}
