package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static  char Symbol;
    static void createBoard(char[]board){
        for(int i =1;i<board.length;i++){
            board[i] = '_';
        }
    }
    static  char playerChoice(){
        System.out.println("Choose a symbol 'x' or 'o' ");
        Symbol = sc.next().charAt(0);
        return Symbol;
    }
    static  char computerChoice(){
        if(Symbol=='x'){
            return 'o';
        }
        else
            return 'x';
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game");
        createBoard(board);
        System.out.println("Player Choice is "+ playerChoice());
        System.out.println("Computer Choice is "+ computerChoice());
    }

}
