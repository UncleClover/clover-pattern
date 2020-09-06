package com.clover.pattern.singleton;

/**
 * 单例：懒汉模式
 * 
 * @author zhangdq
 *
 */
public class LazySingleton {
	/**
	 * volatile：保证多线程安全
	 */
	private volatile static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}

			}
		}
		return instance;
	}

	public static void main(String[] args) {
		LazySingleton instance1 = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		System.out.println(instance1 == instance2);
	}
}
