package com.gameApp.GameApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.gameApp.game.MarioGame;

import com.gameApp.game.GameRunner;
import com.gameApp.game.GamingConsole;

@SpringBootApplication
public class GameAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GameAppApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		GamingConsole game= new MarioGame();
//		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
