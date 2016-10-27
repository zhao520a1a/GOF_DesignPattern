package com.observer;

import java.util.*;

//抽象主题类 
public abstract class AbstractSubject {
	private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	
	//增加观察者
	public void attach(AbstractObserver observer) {
		observers.add(observer);
	}
	
	//移除观察者
	public void detach(AbstractObserver observer) {
		observers.remove(observer);
	}
	
	//向观察者们发出通知
	public void inform() {
		for(AbstractObserver o: observers) {
			o.update();
		}
	}
	
}
