package com.game.tictactoe;

public class TicTacToeGame {
	
	public static char[] createBoard(){
		char[] board=new char[10];
		for (int index = 0; index < board.length; index++) {
			board[index]=' ';
		}
		return board;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] board1=new char[10];
		board1=createBoard();
	}

}
