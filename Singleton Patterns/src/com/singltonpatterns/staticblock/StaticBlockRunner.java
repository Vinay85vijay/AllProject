package com.singltonpatterns.staticblock;

public class StaticBlockRunner {

	public static void main(String[] args) {
		Class<StaticBlock> instance = StaticBlock.class;
		System.out.println(instance);

	}

}
