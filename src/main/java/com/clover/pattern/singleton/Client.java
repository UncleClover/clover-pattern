package com.clover.pattern.singleton;

public class Client {
	public static void main(String[] args) {
		LoaderBalance balance1 = LoaderBalance.getInstance();
		LoaderBalance balance2 = LoaderBalance.getInstance();
		LoaderBalance balance3 = LoaderBalance.getInstance();
		LoaderBalance balance4 = LoaderBalance.getInstance();

		if (balance1 == balance2 && balance2 == balance3 && balance3 == balance4) {
			System.out.println("服务器负载均衡器具有唯一性");
		}

		balance1.addServer("server1");
		balance2.addServer("server2");
		balance3.addServer("server3");
		balance4.addServer("server4");
		String a = "Hello";
		String b = "Hello";

		for (int i = 0; i < 10; i++) {
			System.out.println(balance1.getServer());
		}
	}
}
