package com.dddd;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;

//通过让bean 实现 Aware 接口，则能在 bean 中获得相应的 Spring 容器资源。
public class User implements BeanNameAware {
	private String beanName;
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@PostConstruct
	public void setNameT(){
		this.name = "ddddd";
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}

	public String getBeanName() {
		return beanName;
	}
}
