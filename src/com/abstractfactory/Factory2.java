package com.abstractfactory;

//一个具体工厂角色,专门生产A2,B2产品；
public class Factory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
	
}
