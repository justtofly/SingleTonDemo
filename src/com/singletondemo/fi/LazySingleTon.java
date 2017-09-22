package com.singletondemo.fi;
/**
 * 懒加载
 * 线程安全，调用效率不高，但是可以延时加载（这个对象在真正使用的时候才去加载）
 * 问题：资源利用率高了，但是每次调用getInstance()方法都要同步,并发效率低。（造成调用效率低，多个线程去调用，会有一个等待）
 * 比较：如果这个类创建类的对象代价很高，可以使用延时加载懒汉式。如果这个类创建的调用非常频繁，建议用饿汉式。
 * @author Administrator
 *
 */
public class LazySingleTon {
	//创建私有静态属性
	private static LazySingleTon instance;
	//创建私有构造方法
	private LazySingleTon(){};
	public static LazySingleTon getInstance(){
		if(instance==null){
			instance=new LazySingleTon();
		}
		//不是第一次进入，就直接返回之前创建的对象，保证单例
		return instance;
	}
}
