package com.dddd.postProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
//BeanFactoryPostProcessor允许使用者修改容器中的bean definitions
//BeanFactoryPostProcessor可以与bean definitions打交道，但是千万不要进行bean实例化
// （感觉这里应该说的是不要在BeanFactoryPostProcessor进行可能触发bean实例化的操作）。
// 这么做可能会导致bean被提前实例化，会破坏容器造成预估不到的副作用。如果你需要hack到bean实例化过程，请考虑使用BeanPostProcessor。
//比如配置文件中bean占位符的替换操作
public class BeforeBeanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");

		user.getPropertyValues().add("name","kunge");
//		beanFactory.d

	}
}
