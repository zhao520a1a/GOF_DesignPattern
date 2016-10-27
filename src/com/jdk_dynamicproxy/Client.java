package com.jdk_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//客户端
public class Client {
	
	public static void main(String[] args) {
		//真实对象（被代理对象）
		final AbstractSubject1 rs1 = new RealSubject();
	
		//为真实对象制定一个调用处理器(自己写的)
		InvocationHandler handler  = new MyHandler(rs1);
		
		//获得真实对象的一个代理类对象 -----重要知识点
		Object proxyObj = Proxy.newProxyInstance(
					rs1.getClass().getClassLoader(), //真实对象的类加载器
					rs1.getClass().getInterfaces(), //真实对象的所有接口
					handler                        //真实对象的处理器
		);  
		
		if(proxyObj instanceof AbstractSubject1) {
			System.out.println("这是AbstractSubjict1实体的代理对象"); 
			
			//为了能调用真实对象的方法，要强转为真实对象类的代理对象；
			AbstractSubject1 proxyAS1 = (AbstractSubject1)proxyObj;
			proxyAS1.print(); //内部是通过handler的invoke方法执行；
			
		} else {
			System.out.println("这不是AbstractSubjict1实体的代理对象");
		}
	}
	
}
