package com.singletondemo.fi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test1();
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
