package ticTacToe;

import javax.swing.JOptionPane;
import javafx.scene.control.Button;

public class MyButton {
	Button button;
	int i, j;
	
	MyButton(Button b, int i, int j){
		this.button = b;
		this.i = i;
		this.j = j;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button b) {
		this.button = b;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	public void click(Player ti, Matrix m){
		int player = 0;
		if(ti.getCurrentPlayer() == 0){
			player = 1;
			button.setText("X");
			m.matrix[i][j] = 1;
			if(m.checkIfWon(player) == true){
				System.out.println("X wins!");
				JOptionPane.showMessageDialog(null, "X wins!");
				System.exit(0);
			}
		}
		else{
			player = -1;
			button.setText("O");
			m.matrix[i][j] = -1;
			if(m.checkIfWon(player) == true){
				System.out.println("O wins!");
				JOptionPane.showMessageDialog(null, "O wins!");
				System.exit(0);
			}
		}
		button.setDisable(true);
		player = (ti.currentPlayer == 0 ? 1 : 0);
		ti.setCurrentPlayer(player);
	}
}
