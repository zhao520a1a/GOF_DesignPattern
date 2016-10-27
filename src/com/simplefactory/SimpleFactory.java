package com.simplefactory;

//这是一个具体工厂角色
public class SimpleFactory {
	
	public AbstractProduct createProduct(char productFlag) {
		switch(productFlag) {
		case 'A': 
			return new ProductA();
		case 'B': 
			return new ProductB();
		default:
			return null;
		}
	}
}
