package com.simplefactory;

//具体产品角色B
public class ProductB implements AbstractProduct {

	@Override
	public void instruction() {
		System.out.println("我是产品B!");
	}

}
