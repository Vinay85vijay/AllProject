package com.singltonpatterns.staticblock;

public class StaticBlock {
	private static StaticBlock instance;
	private StaticBlock() {
		
	}
  static {
	  instance=new StaticBlock();
  }
}
