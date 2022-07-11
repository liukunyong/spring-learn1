package com.dddd;

import com.dddd.beanPostProcesser.MyBeanPostProcesser;
import com.dddd.postProcesser.BeforeBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {
	@Bean ("user")
	public User user(){
		return new User("dhd",19);
	}

	@Bean
	public static BeforeBeanFactory beforeBeanFactory() {

		return new BeforeBeanFactory();
	}
	@Bean
	public static MyBeanPostProcesser myBeanPostProcesser(){
		return new MyBeanPostProcesser();}
}
