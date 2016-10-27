package com.command;

//客户端的调用程序；
public class Client {
	public static void main(String[] args) {
		//创建调用者
		Invoker invoker = new Invoker();
		
		//创建一个具体的命令，并指定它具体接受者 ---核心
		Command command = new ConcreteCommand(new Receiver());
		
		//给调用者发布一个具体命令
		invoker.setCommand(command);
		
		//调用者执行命令，其实是将其传送给具体的接收者并让其真正执行；
		invoker.action();
		
		
	}
}
