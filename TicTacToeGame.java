package com.game.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	Scanner sc=new Scanner(System.in);
		
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
		char compMark='x';
		System.out.println("Enter your mark (X or O) : ");
		char userMark=sc.next().charAt(0);
		switch(userMark) {
		case 'x':
			compMark='o';
			break;
		case 'X':
			compMark='O';
		case 'o':
			compMark='x';
			break;
		case 'O':
			compMark='X';
			break;
		default:System.out.println("Invalid input mark");
			System.exit(0);
		   }
		}
	
	//UC3 display the board
	public void displayBoard(char[] show) {
		for (int grid = 0; grid < show.length; grid++) {
			if (grid==3||grid==6) {
				System.out.println();
			}
			System.out.print(show[grid]+"|");
		}
	}
	
	//UC4 move mark to perticular location
	public void moveMark(char[] show) {
		System.out.println("Enter your position in the board");
		char firstMarkPosition=sc.next().charAt(0);
		char secondMarkPosition=sc.next().charAt(0);
		if (firstMarkPosition==0&&secondMarkPosition==0) {
			if (show[0]!=' ') {
				show[0]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==0&&secondMarkPosition==1) {
			if (show[1]!=' ') {
				show[1]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==0&&secondMarkPosition==2) {
			if (show[2]!=' ') {
				show[2]='f';				
			}else
				System.out.println("Enter another position");

		}else if(firstMarkPosition==1&&secondMarkPosition==0) {
			if (show[3]!=' ') {
				show[3]='f';				
			}else
				System.out.println("Enter another position");

		}else if(firstMarkPosition==1&&secondMarkPosition==1) {
			if (show[4]!=' ') {
				show[4]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==1&&secondMarkPosition==2) {
			if (show[5]!=' ') {
				show[5]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==2&&secondMarkPosition==0) {
			if (show[6]!=' ') {
				show[6]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==2&&secondMarkPosition==1) {
			if (show[7]!=' ') {
				show[7]='f';				
			}else
				System.out.println("Enter another position");
		}else if(firstMarkPosition==2&&secondMarkPosition==2) {
			if (show[8]!=' ') {
				show[8]='f';				
			}else
				System.out.println("Enter another position");
		}
		for (int i = 0; i < show.length; i++) {
			System.out.println(show[i]);
		}
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		char[] showBoard=createBoard();
		TicTacToeGame gameObj=new TicTacToeGame();
		gameObj.characterChoose();
		gameObj.displayBoard(showBoard);
		gameObj.moveMark(showBoard);
	}
}
