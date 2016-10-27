package com.abstractfactory;

//这是一个抽象工厂角色，可对应多个抽象产品；
public interface AbstractFactory {
	public AbstractProductA createProductA(); //生产A类产品
	public AbstractProductB createProductB(); //生产B类产品
}
