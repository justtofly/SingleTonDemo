package com.singletondemo.fi;
/**
 * 第四种单例模式：静态内部类实现方式
 * 优点：线程安全，调用效率高，具有懒加载（使用的时候，调用它的静态方法，创建对象）
 * 当我们第一次初始化这个类的时候，并不会立即初始化它的静态内部类，只有你真正调用它的静态方法的时候，
 * 才会加载初始化静态内部类，从而实例化对象，实现了延时加载。
 * 类加载实现天然的线程安全，也不存在同步，所以效率高。很多开源框架用到单例的时候，就会使用这个方式。
 * @author Administrator
 *
 */
public class StaticInnerSingleTon {
	//私有构造方法
	private StaticInnerSingleTon(){}
	//创建静态内部类
	private static class Single{
		//实例化对象。static final类型，保证了内存中只有一个实例存在，而且只能被赋值一次，从而保证了线程的安全
		private static final StaticInnerSingleTon instance=new StaticInnerSingleTon();
	}
	//公共的对外访问方法
	public static StaticInnerSingleTon getInstance(){
		return StaticInnerSingleTon.Single.instance;
	}
}
