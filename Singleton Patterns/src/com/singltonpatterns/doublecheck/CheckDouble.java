package com.singltonpatterns.doublecheck;

public class CheckDouble {

	public static void main(String[] args) {
		DoubleChecking instance= DoubleChecking.getInstance();
		System.out.println(instance);
	}

}
