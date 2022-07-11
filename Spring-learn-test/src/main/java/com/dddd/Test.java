package com.dddd;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ff = new  ClassPathXmlApplicationContext("user.xml");
//		AnnotationConfigApplicationContext ff = new AnnotationConfigApplicationContext(JavaConfig.class);
////		AutowireCapableBeanFactory ff = new XmlBeanFactory(new ClassPathResource("user.xml"));
//
		User user = (User) ff.getBean("user");
		System.out.println(user.toString());

		System.out.println(user.getBeanName());
//		long ms = 10211860;
//		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");//这里想要只保留分秒可以写成"mm:ss"
//		formatter.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
//		String hms = formatter.format(ms);
//		System.out.println(hms);
	}
}
