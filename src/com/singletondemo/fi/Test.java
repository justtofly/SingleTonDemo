package com.singletondemo.fi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
		test2();
	}
	/**
	 * 测试懒汉式
	 */
	private static void test2() {
		LazySingleTon lst1=LazySingleTon.getInstance();
		LazySingleTon lst2=LazySingleTon.getInstance();
		System.out.println(lst1);
		System.out.println(lst2);
	}

	/**
	 * 测试饿汉式,两个对象是否是同一个对象
	 */
	private static void test1() {
		HungleSingleTon hst1 = HungleSingleTon.getInstance();
		HungleSingleTon hst2 = HungleSingleTon.getInstance();
		System.out.println(hst1);
		System.out.println(hst2);
	}

}
