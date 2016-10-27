package com.decorator;

//具体装饰者角色
public class Dance extends GirlDecorator {
	Girl girl;
	
	public Dance (Girl girl) {
		this.girl = girl;
	}

	@Override
	public String getDescription() {
		return "会跳舞的" + girl.getDescription();
	}
}
