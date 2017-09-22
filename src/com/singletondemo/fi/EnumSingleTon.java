package com.singletondemo.fi;
/**
 * 使用枚举实现
 * 优点：实现简单，枚举本身就是单例模式。它是基于JVM底层去实现的，避免通过反射和反序列化的漏洞。（即使类的构造器被私有，也可以通过反射去调用）
 * 缺点：没有延时加载
 * @author Administrator
 *
 */
public enum EnumSingleTon {
	//这个枚举元素本身就是单例对象
	INSTANCE;
	//添加自己需要的操作
	public void singletonOperation(){};
}
