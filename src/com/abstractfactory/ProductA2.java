package com.abstractfactory;

//一个具体产品角色：产品A
public class ProductA2 implements AbstractProductA {

	@Override
	public void instruction() {
		System.out.println("我是产品A2!");
	}

}
