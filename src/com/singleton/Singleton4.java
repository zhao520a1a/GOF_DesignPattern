package com.singleton;

//双重锁定检查版
public class Singleton4 {
	
	/*
	 * volatile是一个类型修饰符；它是被设计用来修饰被不同线程访问和修改的变量。
	 * 如果不加volatile,基本上会导致这样的结果：要么无法编写多线程，要么编译器失去大量优化的机会；
	 * 它的作用：作为指令关键字，确保本条指令不会因编译器的优化而省略，且要求每次直接读值；
	 *        简单来说就是防止编译器对代码进行优化；
	 * 一般适用于多线程并行开发；
	 */
	private static volatile Singleton4 s; //第一重锁定，用volatile关键字；
	
	private Singleton4() {
		
	}
	
	public static Singleton4 getInstance() {
		if(s == null) {
			synchronized (Singleton4.class) { //第二种锁定，用synchronized关键字；
				if(s == null) {
					s = new Singleton4();
				}
			}
		}
		return s;
	}
	
	
	
}
