package com.adapter;

public class Test {
	
	public static void main(String[] args) {
		Target t1 = new Adapter1();
		t1.requst();
		Target t2 = new Adapter2();
		t2.requst();
	}
	
}
