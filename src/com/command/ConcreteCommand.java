package com.command;

//具体命令类，通过构造函数决定了该命令有哪个接收者执行；
public class ConcreteCommand extends Command{
	private Receiver reciver;
	
	public ConcreteCommand(Receiver reciver) {
		this.reciver = reciver; 
	}
	
	@Override
	public void execute() {
		System.out.println("命令 被发布…… ");	
		this.reciver.doJob();
	}
	
	
	
}
