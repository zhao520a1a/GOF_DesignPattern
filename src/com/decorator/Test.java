package com.decorator;

//测试类
public class Test {
	
	public static void main(String[] args) {
		Girl ag = new AmericanGirl();
		Girl cg = new ChineseGirl();
		System.out.println(ag.getDescription());
		System.out.println(cg.getDescription());
		
		Art g1 = new Art(ag);
		System.out.println(g1.getDescription());
		Dance g2 = new Dance(g1);
		System.out.println(g2.getDescription());
		
		Sing g3 = new Sing(cg);
		System.out.println(g3.getDescription());
		
		
	}
	
}
