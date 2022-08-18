package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char player;
    static char computerPlayer;
    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static char Symbol;

    static void createBoard(char[] board) {
        for (int i = 1; i < board.length; i++) {
            board[i] = '_';
        }
    }

    static char playerChoice() {
        System.out.println("Choose a symbol 'x' or 'o' ");
        Symbol = sc.next().charAt(0);
        return Symbol;
    }

    static char computerChoice() {
        if (Symbol == 'x') {
            return 'o';
        } else
            return 'x';
    }

    static void showBoard(char[] board) {
        for (int i = 1; i < board.length; i++) {
            System.out.print(board[i]);
            System.out.print(" ");
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

    static void userMove() {
        System.out.println("Choose an index from 1 to 9 to write 'X': ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (board[index] == ' ') {
            board[index] = player;
        } else {
            System.out.println("   ****** Choose an empty place! ******   ");
            System.out.println();
            userMove();

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game");
        createBoard(board);
        System.out.println("Player Choice is " + playerChoice());
        System.out.println("Computer Choice is " + computerChoice());
        showBoard(board);

        if (player == 'X') {
            computerPlayer = 'O';
        } else {
            computerPlayer = 'X';
        }
        while (true) {
            userMove();
            showBoard(board);
        }

    }

}

