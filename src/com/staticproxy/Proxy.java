package com.staticproxy;

//代理类
public class Proxy implements AbstractSubject {
	public AbstractSubject as; //保留了一个引用使得代理可以访问实体;这是一个真实的角色作为代理角色的属性；
	
	public Proxy(AbstractSubject as) {
		this.as = as;
	}
	
	@Override
	public void print() {
		System.out.println("Welcome!");//代理类所做的事；
		as.print(); //实际内部也是调用委托类是方法；相当于回调；
	}

}
