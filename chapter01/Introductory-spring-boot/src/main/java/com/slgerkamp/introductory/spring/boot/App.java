package com.slgerkamp.introductory.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Webアプリケーション作成
 * 
 * コントローラークラス作成
 * 自動設定を有効に
 * HTTPリクエストのパス設定
 * HTTPレスポンスの記述
 * Spring bootアプリケーションの実行
 *
 */
@RestController
@EnableAutoConfiguration
public class App {
	
	@RequestMapping("/")
	String home(){
		return "Hello, Spring boot";
	}
	
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
