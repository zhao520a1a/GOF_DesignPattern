package com.abstractfactory;

//测试类；
public class Test {
	
	public static void main(String[] args) {
		AbstractFactory f1 = new Factory1();
		AbstractFactory f2 = new Factory2();
		
		f1.createProductA().instruction();
		f1.createProductB().instruction();
		
		f2.createProductA().instruction();
		f2.createProductB().instruction();
		
	}


	
}
