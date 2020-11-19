package com.game.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	//UC1 creating board and initialize with blank spaces
	public static char[] createBoard(){
		char[] board=new char[10];
		for (int index = 1; index < board.length; index++) {
			board[index]=' ';
		}
		return board;
	}
	
	public void choosePlayer() {
		Scanner sc=new Scanner(System.in);
		char compMark='x';
		System.out.println("Enter your mark (X or O) : ");
		char usermark=sc.next().charAt(0);
		if (usermark=='x'||usermark=='X') {
			compMark='O';
		}else if (usermark=='o'||usermark=='O') {
			compMark='X';
		}else
			System.out.println("Invalid input mark");
		System.out.println("User Marks is :"+usermark+" Computer Marks is :"+compMark);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board=createBoard();
		TicTacToeGame TicTacToeGameObj=new TicTacToeGame();
		TicTacToeGameObj.choosePlayer();
	}

}
