package com.singltonpatterns.billpugh;

public class Billpughmethod {
	
	private Billpughmethod() {
		String s = "nswk";
	}
       private static class Billpugh {
		private static final Billpughmethod instance= new Billpughmethod();
       }
       public static Billpughmethod getInstance() {
		return Billpugh.instance;
    	   
       }
}
