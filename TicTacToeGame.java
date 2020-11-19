package com.game.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	//UC1 creating board and initialize with blank spaces
	public static char[] createBoard(){
		char[] board=new char[9];
		for (int index = 1; index < board.length; index++) {
			board[index]=' ';
		}
		return board;
	}
	
	//UC2 creating method to allow user to choose letter
	public void characterChoose() {
		Scanner sc=new Scanner(System.in);
		char compMark='x';
		System.out.println("Enter your mark (X or O) : ");
		char userMark=sc.next().charAt(0);
		if (userMark=='x'||userMark=='X') {
			compMark='O';
		}else if (userMark=='o'||userMark=='O') {
			compMark='X';
		}else {
			System.out.println("Invalid input mark");
			}
	}
	
	//UC3 display the board
	public void displayBoard(char[] show) {
		for (int i = 0; i < show.length; i++) {
			if (i==3||i==6) {
				System.out.println();
			}
			System.out.print(show[i]+"|");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] showBoard=createBoard();
		TicTacToeGame gameObj=new TicTacToeGame();
		gameObj.characterChoose();
		gameObj.displayBoard(showBoard);
	}

}
