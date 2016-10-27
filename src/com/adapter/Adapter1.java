package com.adapter;

//类适配器模式：采用继承的方式方式
public class Adapter1 extends Adaptee implements Target {
	
	public void requst() {
		super.specificRequst();
	}

}
