package tictactoe;

import java.util.Scanner;
import java.util.Random;

public class App {
	public enum Cell {
		E, X, O
	}

	private Cell[][] board;

	public App() {
		board = new Cell[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Cell.E;
			}

		}
	}

	public String toString() {
		String result = "";
		for (Cell[] row : board) {
			for (Cell c : row) {
				if (c == Cell.E)
				result += "_";
				else
				result += c;

			}
			result += "\n";
		}
		return result;
	}
	
	public void setCell(int row, int col, Cell value ){
		board [row][col] = value;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		App b = new App();
		System.out.println(b);
		b.setCell(1, 1, Cell.X);
		System.out.println(b);

	}

}
