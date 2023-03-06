package com.singltonpatterns.billpugh;

public class BillPughRunner {

	public static void main(String[] args) {
		
		Billpughmethod instance = Billpughmethod.getInstance();
		System.out.println(instance);
	}

}
