package com.pojo;

public class Board {
	int board[], snakes[], ladder[];

	public void createBoard() {
		board = new int[101];

		for (int i = 1; i <= 100; i++) {
			board[i] = i;
		}
		
		setLadder();
		setSnakes();
		
		for(int i=1;i<=100;i++) {
			if(snakes[i] != 0) {
				board[i] = 1000 ; // set 1000 for snakes
			}
			if(ladder[i] != 0) {
				board[i] = 2000 ; // set 2000 for ladders
			}
			
		}

	}

	public void setLadder() {
		snakes = new int[101];

		snakes[15] = 4;
		snakes[35] = 9;
		snakes[53] = 23;
		snakes[75] = 45;
		snakes[88] = 51;
		snakes[92] = 72;
		snakes[99] = 3;
	}

	public void setSnakes() {
		ladder = new int[101];

		ladder[7] = 44;
		ladder[21] = 49;
		ladder[13] = 88;
		ladder[74] = 93;
		ladder[36] = 60;
		ladder[59] = 79;
		ladder[67] = 83;

	}
}
