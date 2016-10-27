package com.decorator;

//具体装饰者角色
public class Art extends GirlDecorator {
	Girl girl;
	
	public Art (Girl girl) {
		this.girl = girl;
	}

	@Override
	public String getDescription() {
		return "会画画的" + girl.getDescription();
	}
}
