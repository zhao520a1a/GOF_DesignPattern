package com.staticproxy;

//真正的实体类（委托类）
public class RealSubject implements AbstractSubject {

	@Override
	public void print() {
		System.out.println("Hello , I'am happy！");
	}
	
}
