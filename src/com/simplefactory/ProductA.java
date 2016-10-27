package com.simplefactory;

//具体产品角色A
public class ProductA implements AbstractProduct {

	@Override
	public void instruction() {
		System.out.println("我是产品A!");
	}

}
