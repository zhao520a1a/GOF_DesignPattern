package com.singleton;


public class Singleton1 {
	//这里必须用staic,因确保某个类只有一个实例,也是为了在getInstance()这个静态方法中使用它；
	private static Singleton1 s;
	
	//首先将构造函数私有；使在在类的外部不能被实例化；
	private Singleton1() {
		
	}

	//这里必须用staic，因为无法通过动态的实例化对象调用，只能是静态的；
	public static Singleton1 getInstance() {
		if(s == null) { //第一次a的栈为空的；
			s = new Singleton1();
		}
		return s;
	}
	
	
}
