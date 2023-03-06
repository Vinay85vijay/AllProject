package com.sorting.consumer;


import java.util.List;
import java.util.logging.Logger;

import com.sortingutility.MySortingUtil;

public class MyConsumeUtil {

	public static void main(String[] args) {
	Logger logger = 
			Logger.getLogger(MyConsumeUtil.class.getName()) ;
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = List.of("vinay","manu","aliya","gb");
		logger.info(sorted.toString());

	}

}
