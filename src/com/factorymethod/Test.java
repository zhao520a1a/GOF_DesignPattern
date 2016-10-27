package com.factorymethod;

//测试类
public class Test{
	
	public static void main(String[] args) {
		AbstractFactory ab1 = new FactoryA();
		AbstractFactory ab2 = new FactoryB();
		
		ab1.createProduct().instruction();
		ab2.createProduct().instruction();
	}
	
}
