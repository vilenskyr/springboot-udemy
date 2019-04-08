package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(SpringbootIn10StepsApplication.class, args);

//		for (String beanName : appCtx.getBeanDefinitionNames()) {
//
//			System.out.println("BEAN: " + beanName);
//		}
	}

}
