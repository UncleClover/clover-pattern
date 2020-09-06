package com.clover.pattern.singleton;

public class Singleton {
	private Singleton() {
	}

	private static class HolderClass {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return HolderClass.instance;
	}

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);
	}
}
