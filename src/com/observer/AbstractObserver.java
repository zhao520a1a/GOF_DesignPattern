package com.observer;

//抽象观察者类；为所以具体观察者定义一个接口，在得到通知时更新自己；
public abstract class AbstractObserver {
	public abstract void update();
		
}
