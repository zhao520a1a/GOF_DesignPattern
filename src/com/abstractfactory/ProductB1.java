package com.abstractfactory;

//一个具体产品角色：产品B
public class ProductB1 implements AbstractProductB {

	@Override
	public void instruction() {
		System.out.println("我是产品B1!");
	}

}
