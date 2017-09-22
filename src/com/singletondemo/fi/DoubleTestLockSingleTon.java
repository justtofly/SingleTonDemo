package com.singletondemo.fi;
/**
 * 双重检测锁模式
 * 这个模式是将同步内容放到if内部，提高了执行效率，不必每次获取对象都进行同步，只有第一次才同步，创建了之后就没必要。这个模式既提高了效率，
 * 又有了延时加载，但是，由于JVM底层内部模型原因，偶尔会出问题，一般不建议使用
 * @author Administrator
 *
 */
public class DoubleTestLockSingleTon {
	//私有静态属性，并初始化为空
	private static DoubleTestLockSingleTon instance=null;
	//私有构造方法
	private DoubleTestLockSingleTon(){}
	//创建一个对外的公共方法
	public static DoubleTestLockSingleTon getInstance(){
		if(instance==null){
			DoubleTestLockSingleTon dtst;
			synchronized (DoubleTestLockSingleTon.class) {
				dtst=instance;
				synchronized (DoubleTestLockSingleTon.class) {
					if(dtst==null){
						dtst=new DoubleTestLockSingleTon();
					}
					instance=dtst;
				}
			}
			
		}
		return instance;
	}
}
