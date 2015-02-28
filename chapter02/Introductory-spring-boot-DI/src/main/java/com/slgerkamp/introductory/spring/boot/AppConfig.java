package com.slgerkamp.introductory.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 2.1 Spring FrameworkによるDI
 * Java Configクラス
 *
 */
@Configuration
public class AppConfig {

	@Bean
	Calculator calculator(){
		return new AddCalculator();
	}
}
