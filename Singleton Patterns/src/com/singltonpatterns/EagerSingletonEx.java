package com.singltonpatterns;

 class EagerSingletonEx {
	    private static final EagerSingletonEx instance = new EagerSingletonEx();
	    // private constructor to avoid client applications using the constructor
	    private EagerSingletonEx(){}

	    public static EagerSingletonEx getInstance() {
	        return instance;
	    }
	  public static void main(String[] args) {  
	  EagerSingletonEx instance1 = EagerSingletonEx.getInstance();
		EagerSingletonEx instance2 = EagerSingletonEx.getInstance();
		EagerSingletonEx instance3 = EagerSingletonEx.getInstance();
		System.out.println(instance1);
		 if(instance1==instance2 && instance2==instance3) {
			 System.out.println("all the object adresses are same to same object");
		 }
		 else {
			 System.out.println("object adresses are different");
		 }
  }}