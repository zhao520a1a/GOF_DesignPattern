package com.factorymethod;

//一个具体工厂角色A,专门生产A产品；
public class FactoryA implements AbstractFactory {
	@Override
	public AbstractProduct createProduct() {
		return new ProductA();
	}
}
