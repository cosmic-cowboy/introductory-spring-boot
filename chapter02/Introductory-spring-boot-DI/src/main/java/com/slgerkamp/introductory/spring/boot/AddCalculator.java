package com.slgerkamp.introductory.spring.boot;

/**
 *  2.1 Spring FrameworkによるDI
 *
 */
public class AddCalculator implements Calculator{

	public int calc(int a, int b) {
		return a + b;
	}
	
}
