package ticTacToe;

public class Matrix {
	int[][] matrix = new int[3][3];		
	
	Matrix() {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matrix[i][j] = 0;
			}
		}
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] m) {
		this.matrix = m;
	}
	
	public boolean checkIfWon(int igrac){
		if(matrix[0][0] == igrac && matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2])
			return true;
		if(matrix[1][0] == igrac && matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2])
			return true;
		if(matrix[2][0] == igrac && matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2])
			return true;
		
		if(matrix[0][0] == igrac && matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0])
			return true;
		if(matrix[0][1] == igrac && matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1])
			return true;
		if(matrix[0][2] == igrac && matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2])
			return true;
		
		if(matrix[0][0] == igrac && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2])
			return true;
		if(matrix[2][0] == igrac && matrix[2][0] == matrix[1][1] && matrix[1][1] == matrix[0][2])
			return true;
		
		return false;
	}
	
	public int proveri(int igrac, int i, int j){
		if(matrix[i][j] == igrac)
			return 1;
		else
			return 0;
	}
}
