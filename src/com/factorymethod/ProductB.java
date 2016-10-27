package com.factorymethod;

//一个具体产品角色：产品B
public class ProductB implements AbstractProduct {

	@Override
	public void instruction() {
		System.out.println("我是产品B!");
	}

}
