package com.games.runner;

import com.games.service.GameService;

public class GameRunner {
	
	 private static GameService gameService;

	public static void main(String[] args) {
		 GameRunner game = new GameRunner();
             gameService.up();
             gameService.down();
             gameService.left();
             gameService.right();
	}

}
