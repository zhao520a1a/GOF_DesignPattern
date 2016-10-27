package com.factorymethod;

//一个具体工厂角色B,专门生产B产品；
public class FactoryB implements AbstractFactory {
	@Override
	public AbstractProduct createProduct() {
		return new ProductB();
	}
}
