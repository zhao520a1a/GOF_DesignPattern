package com.abstractfactory;

//一个具体工厂角色,生产A1,B1产品；
public class Factory1 implements AbstractFactory {
	
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

	
}
