package com.singleton;

//测试单子模式
public class Test {
	public static void main(String[] args) {
		Singleton1 a1 = Singleton1.getInstance();
		Singleton1 a2 = Singleton1.getInstance();
		System.out.println(a1);
		System.out.println(a2);
		Singleton2 a3 = Singleton2.getInstance();
		Singleton2 a4 = Singleton2.getInstance();
		System.out.println(a3);
		System.out.println(a4);
		Singleton3 a5 = Singleton3.getInstance();
		Singleton3 a6 = Singleton3.getInstance();
		System.out.println(a5);
		System.out.println(a6);
		Singleton4 a7 = Singleton4.getInstance();
		Singleton4 a8 = Singleton4.getInstance();
		System.out.println(a7);
		System.out.println(a8);
	}
}
