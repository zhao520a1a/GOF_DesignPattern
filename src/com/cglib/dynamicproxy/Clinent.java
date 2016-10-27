package com.cglib.dynamicproxy;

public class Clinent {
	
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		//通过生成子类的方式创建代理类  
		Subject proxysub = (Subject)proxy.getProxy(new Subject());
		proxysub.say();
	}

}
