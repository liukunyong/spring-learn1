package com.dddd;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ff = new AnnotationConfigApplicationContext(JavaConfig.class);
		BeanFactory ff = new XmlBeanFactory(new ClassPathResource("user.xml"));
		User user = (User) ff.getBean("user");
		System.out.println(user.toString());
	}
}
