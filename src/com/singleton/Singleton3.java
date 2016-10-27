package com.singleton;

public class Singleton3 {
	//用一个私有的静态的内部类来实现单例模式；
	private static class SingletonHolder {
		//是私有的静态常量；
		private static final Singleton3 INSTANCE = new Singleton3();
	}
	
	private Singleton3() {
		
	}
	
	public static Singleton3 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
