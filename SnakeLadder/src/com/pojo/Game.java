package com.pojo;

import java.util.Random;

public class Game {
	Board b = new Board();

	public void startGame() {
		Player p1 = new Player("user");
		Player p2 = new Player("comp");
		b.createBoard();

		/*
		 * for (int i = 1; i <= 100; i++) { System.out.println(b.board[i]); }
		 */

		while (p1.getPos() != 100 && p2.getPos() != 100) {
			System.out.println("****_____****");
			System.out.println("P1 throughs die ");
			int k = throughDie();
			System.out.println("Die - " + k);
			checkResult(p1, k);
			System.out.println("Player 1 new pos : " + p1.getPos());

			System.out.println("P2 throughs die ");
			k = throughDie();
			System.out.println("Die - " + k);
			checkResult(p2, k);
			System.out.println("Player 2 new pos : " + p2.getPos());

		}

		System.out.println("##################");
		if (p1.getPos() == 100) {
			System.out.println("Player 1 won " + p1.getName());
		} else {
			System.out.println("Player 2 won " + p2.getName());
		}
		System.out.println("##################");
	}

	public void checkResult(Player p, int k) {

		int cur_pos = p.getPos();

		if ((cur_pos + k) > 100) {
			System.out.println("No move ");
		} else {
			p.setPos(checkSnakeLadder(cur_pos + k));
		}

	}

	public int checkSnakeLadder(int k) {

		if (b.board[k] == 1000) {
			System.out.println("Bitten by Snake from " + k + " to "
					+ b.snakes[k]);
			k = b.snakes[k];
		} else if (b.board[k] == 2000) {
			System.out.println("Got a ladder from " + k + " to " + b.ladder[k]);
			k = b.ladder[k];
		}

		return k;
	}

	public int throughDie() {
		Random random = new Random();
		int r = random.nextInt(7 - 1) + 1;
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		System.out.println("Start game");
		game.startGame();

	}

}
