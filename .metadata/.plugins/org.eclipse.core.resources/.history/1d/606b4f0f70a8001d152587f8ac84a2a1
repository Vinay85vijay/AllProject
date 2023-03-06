package com.functionalprog;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.w3c.dom.ranges.Range;

public class Fp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		
	 extracted();
		    
 	}

	private static void extracted() {
		Predicate<? super Integer> evenPredicate = n->n%10==0;
		Function<? super Integer, ? extends Integer> mapper = n->n*n;
		List<Integer> of = List.of(10,20,30);
		of.stream().filter(evenPredicate).map(mapper).forEach(System.out::println);
	//	System.out.println(List.of(10,20,30));
	}

}
