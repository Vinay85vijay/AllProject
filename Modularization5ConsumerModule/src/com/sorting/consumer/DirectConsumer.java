package com.sorting.consumer;


import java.util.List;
import java.util.logging.Logger;

import com.sorting.algorithm.BubbleSort;



public class DirectConsumer {

	public static void main(String[] args) {
		 Logger logger = 
			Logger.getLogger(DirectConsumer.class.getName()) ;
		BubbleSort util = new BubbleSort();
		List<String> sorted = List.of("vinay","manu","aliya","gb");
		logger.info(sorted.toString());

	}

}
