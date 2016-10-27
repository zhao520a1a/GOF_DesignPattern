package com.decorator;

//具体装饰者角色
public class Sing extends GirlDecorator {
	Girl girl;
	
	public Sing (Girl girl) {
		this.girl = girl;
	}

	@Override
	public String getDescription() {
		return "会唱歌的" + girl.getDescription();
	}
	
}
