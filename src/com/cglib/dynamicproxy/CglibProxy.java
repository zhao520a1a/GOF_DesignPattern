package com.cglib.dynamicproxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*
 * 代理类
 */

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();
	
	// 目的：通过字节码技术为被代理类创建一个子类;
	public Object getProxy(Object target) {
		// 设置被代理类，注意形参是该类的字节码；
		enhancer.setSuperclass(target.getClass());
		// 回调intercept()方法
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}

	/*
	 * 实现MothodInterceptor接口的intercept()方法；
	 * obj表示被代理类的实例，method表示被代理类方法的反射对象，args为方法的动态入参，proxy为代理类实例。
	 * 目的：拦截所有被代理类方法的调用；
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("前置代理");

		// proxy.invokeSuper()是通过代理类调用父类中的方法。
		Object result = proxy.invokeSuper(obj, args);

		System.out.println("后置代理");
		return result;
	}

}
