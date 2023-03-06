package com.singltonpatterns.syncronized;

public class SingletonSyncronized {
	private static SingletonSyncronized instance;
	

private SingletonSyncronized() {
	
}
public static synchronized SingletonSyncronized getInstance() {
	if(instance==null) {
		instance= new SingletonSyncronized();		
	}
	return instance;
	
}



}
