package com.simplefactory;

//测试类
public class Test {
	
	public static void main(String[] args) {
		SimpleFactory sf = new SimpleFactory();
		
		sf.createProduct('A').instruction();
		sf.createProduct('B').instruction();
		
	}


	
}
