package com.games.Mario;

import com.games.service.GameService;

public class Mario implements GameService {

	public void up() {
       System.out.println("mario jumping");		
	}

	public void down() {
           	System.out.println("mario sitting");	
	}

	public void left() {
        System.out.println("mario running left");		
	}

	public void right() {
		System.out.println("mario running right");
		
	}

}
