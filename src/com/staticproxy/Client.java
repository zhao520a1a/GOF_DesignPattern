package com.staticproxy;

public class Client {
	public static void main(String[] args) {
		AbstractSubject as = new RealSubject();
		Proxy staticProxy = new Proxy(as);//当两个类需要通信时，引入第三方代理类;
		staticProxy.print(); 
	}
}
