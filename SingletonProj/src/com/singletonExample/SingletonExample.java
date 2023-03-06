package com.singletonExample;

public class SingletonExample {
	private static SingletonExample instance1;
	private static SingletonExample instance2;
	private static int count;
	private static int seed=3;
	private SingletonExample() {
	
	}
	public int showCount() {
		return count;
	}

	public static SingletonExample getInstance() {
		count++;
	//	int seed=SingletonExample.seed;
		
		
		if ( 0 != count %2) {
			if(instance1==null) {
				instance1= new SingletonExample();
			}
			return instance1;
		}
		else
		{ if 
			(instance2==null) {
				instance2= new SingletonExample();
			}
			return instance2;
		}
			
	}
	
	public static void setSeed() {
		int seed = SingletonExample.seed;
		for(int i=0;i<2*seed;i++) {
			System.out.println(SingletonExample.getInstance()+"->" );
			
		}
	}		
}

class Runner {

	public static void main(String[] args) {
		
       SingletonExample instance = SingletonExample.getInstance();
//       SingletonExample instance2 = SingletonExample.getInstance();
//       SingletonExample instance3 = SingletonExample.getInstance();
//       SingletonExample instance4 = SingletonExample.getInstance();
//       System.out.println(instance1.getInstance());
       instance.setSeed();
       
//              boolean result = instance1==instance3;
//       System.out.println("instance 1 and 3 pointing to same obj : " +result+" -> "+instance1);
//       boolean result1 = instance2==instance4;
////       
//       System.out.println("instance 2 and 4 pointing to same obj :"+result1+" -> "+instance2);
//       System.out.println();
//      System.out.println("obj created for odd instance");
   //   System.out.println(instance.showCount());
//       System.out.println();
//       System.out.println("obj created for even instance");
//      System.out.println(instance2.showCount());
//  
	}

}