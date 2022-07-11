package com.dddd.beanPostProcesser;

import com.dddd.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcesser  implements BeanPostProcessor{

	//在bean初始化之前执行
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("user".equals(beanName)){
//			User bean1 = (User) bean;
//			bean1.setBeanName("didid");
			((User) bean).setName("dud");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	//在bean的初始化之后执行
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)  throws BeansException{
//		try {
//			if("user".equals(beanName)){
////			User bean1 = (User) bean;
////			bean1.setBeanName("didid");
//				((User) bean).setName("dud");
//			}
//		}catch (Exception e){
//
//		}

		return bean;
	}
}
