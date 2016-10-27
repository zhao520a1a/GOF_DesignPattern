package com.observer;

//具体主题； 将有关状态存入具体观察者对象；在具体主题状态改变时，想所有登记的观察者发出通知；
public class ConcreteSubject extends AbstractSubject {
		private String subjectState;
		
		public String getSubjectState() {
			return subjectState;
		}
		
		public void setSubjectState(String subjectState) {
			this.subjectState = subjectState;
		}
}
