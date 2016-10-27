package com.facade;

/**
 * 封装了子系统中的ModuleA, ModuleB, ModuleC; 向用户提供了一个统一的接口；
 * 注意：作为一个门面类只能有一个实例（所以说它也是一个单例模式）
 * 有了这个Facade类，那么客户端就不需要亲自调用子系统中的ModuleA、ModuleB、ModuleC;甚至不需要知道它们的存在；
 * 客户端只要和Facade类交互就好了，从而实现客户端和子系统中MouduleA,ModuleB,ModuleC模块的解耦，让客户更容易的使用系统；
 * @author 小鑫哦
 *
 */

public class Facade {
	//示意方法，满足客户端需要的功能；
	public void test() {
		ModuleA a  = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}
}
