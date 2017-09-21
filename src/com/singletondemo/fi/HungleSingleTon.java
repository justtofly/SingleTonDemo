package com.singletondemo.fi;
/**
 * 第一种：饿汉式
 * 当类加载的时候，立即加载这个对象，对外提供一个方法，可以取出对象。这样做线程安全，调用效率高。
 * 但是如果后面没有用到这个对象，会造成资源浪费，一般我们希望延时加载，当我们用到的时候去加载，也就是懒汉式，
 * 懒汉式实现了，延时加载。
 * @author Administrator
 *
 */
public class HungleSingleTon {
	//提供一个静态static的私有属性。
	private static HungleSingleTon instance=new HungleSingleTon();
	//创建私有构造方法，这样别人就不能访问
	private HungleSingleTon(){}
	//提供一个开放的方法，只能从方法里面取对象
	public static HungleSingleTon getInstance(){
		//方法没有同步，调用效率高
		return instance;
	}
}
