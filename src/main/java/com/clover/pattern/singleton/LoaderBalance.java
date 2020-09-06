package com.clover.pattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoaderBalance {
	private static LoaderBalance instance = null;

	private List<String> serverList = null;

	private LoaderBalance() {
		serverList = new ArrayList<>();
	}

	public static LoaderBalance getInstance() {
		if (instance == null) {
			instance = new LoaderBalance();
		}
		return instance;
	}

	public void addServer(String server) {
		serverList.add(server);
	}

	public void delServer(String server) {
		serverList.remove(server);
	}

	public String getServer() {
		return serverList.get(new Random().nextInt(serverList.size()));
	}
}
