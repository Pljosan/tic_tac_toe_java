package ticTacToe;

public class Player {
	int currentPlayer;
	
	Player(int player){
		currentPlayer = player;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int player) {
		this.currentPlayer = player;
	}
}
