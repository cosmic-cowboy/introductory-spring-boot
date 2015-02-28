package com.slgerkamp.introductory.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 *  2.1 Spring FrameworkによるDI
 *
 */
@EnableAutoConfiguration
@Import(AppConfig.class)
public class App {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = 
				SpringApplication.run(App.class, args)){
			
			int a = 5;
			int b = 4;
			System.out.println("a:" + a + ", b:" + b);
			
			Calculator cal = context.getBean(Calculator.class);
			int result = cal.calc(a, b);
			
			System.out.println("result:" + result);
		}
	}
}
