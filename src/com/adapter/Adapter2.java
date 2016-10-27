package com.adapter;

//对象适配器模式：采用对象组合方式实现
public class Adapter2 implements Target {
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void requst() {
		adaptee.specificRequst();
	}

}
