package com.command;

//调用者，负责将具体的命令传送给具体的接收者；
public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
	
}
