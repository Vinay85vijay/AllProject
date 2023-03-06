package com.gameApp.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame  implements GamingConsole{

	
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("mario jump");
		
	}

	
	public void down() {
         System.out.println("maro down");		
	}

	
	public void left() {
     System.out.println("mario left ");		
	}

	
	public void right() {
     System.out.println("mario right");		
	}

}
