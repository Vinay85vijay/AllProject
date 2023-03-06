package com.games.contra;

import com.games.service.GameService;

public class Contra implements GameService {

	
	public void up() {
     System.out.println("contro jumping");		
	}

	
	public void down() {
      System.out.println("contra sitting");		
	}

	
	public void left() {
        System.out.println("contra running left");		
	}

	
	public void right() {
		 System.out.println("contra running right");
		
	}

}
