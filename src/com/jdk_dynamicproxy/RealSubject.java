package com.jdk_dynamicproxy;

//真正的实体类（委托类）
public class RealSubject implements AbstractSubject1 {

	@Override
	public void print() {
		System.out.println("Hello , I'am happy！");
	}
	
}
