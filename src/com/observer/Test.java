package com.observer;

public class Test {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "Observer A"));
		subject.attach(new ConcreteObserver(subject, "Observer B"));
		subject.attach(new ConcreteObserver(subject, "Observer C"));
		
		subject.setSubjectState("Ready");
		subject.inform();
		
		subject.setSubjectState("Start");
		subject.inform();
		
	}
}
