package com.observer;

//具体观察者，实现抽象观察者所要求的更新接口；
public class ConcreteObserver extends AbstractObserver {
	private String observerState;
	private String name;
	private ConcreteSubject subject;
	
	//具体观察者用一个具体主题实现
	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	//实现抽象观察者中的更新操作；
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("The observer'state of " + name + " is " + observerState);
	}
	
	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
