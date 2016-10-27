package com.factorymethod;

//这是一个抽象工厂角色，与抽象产品一一对应；
public interface AbstractFactory {
	public AbstractProduct createProduct();
}
