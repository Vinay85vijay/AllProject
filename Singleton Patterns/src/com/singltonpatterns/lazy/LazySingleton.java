package com.singltonpatterns.lazy;

public class LazySingleton {

	public static void main(String[] args) {
		SingletonLazy instance = SingletonLazy.getInstance();
	       System.out.println(instance);
	}

}
