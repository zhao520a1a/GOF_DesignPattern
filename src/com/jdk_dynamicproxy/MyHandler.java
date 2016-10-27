package com.jdk_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//调用处理器(它就相当于一个代理类)
public class MyHandler implements InvocationHandler {
	private Object target; //这是一个真实的角色作为代理角色的属性；
	
	//构造器
	public MyHandler(Object target) {
		this.target = target;
	}
	
	/**
	 * 通过反射机制动态执行真实角色的每一个方法；
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("被拦截的方法:" + method.getName()); 
			System.out.println("预处理.");

			Object result =  method.invoke(target, args);//调用真是对象的method方法
			return result;
		} catch (Exception e) {
			return null;
		} finally {
			System.out.println("善后处理.");
		}
	}

}
