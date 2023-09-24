package com.LLDs.TicTacToe;

import com.LLDs.TicTacToe.Pair;

import java.util.*;



public class gameBoard {
    int size;
    PlayingPiece [][]board;

    gameBoard(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean isEmpty(int row, int col) {
        return board[row][col] == null;
    }

    public boolean fill(int row, int col, PlayingPiece p) {
        if(isEmpty(row, col)) {
            board[row][col] = p;
            return true;
        }
        return false;
    }

    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();
        for(int i = 0; i < size; i ++) {
            for(int j = 0; j < size; j ++) {
                if(isEmpty(i, j)) {
                    Pair p = new Pair(i, j);
                    freeCells.add(p);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].type.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

    public boolean victory(int row, int col, PlayingPiece p) {

        boolean winner = true, asliWinner = false;
        for(int j = 0; j < size; j ++) {
            if(board[row][j] == null || board[row][j] != p) winner = false;
        }
        asliWinner |= winner;
        winner = true;
        for(int i = 0; i < size; i ++) {
            if(board[i][col] == null || board[i][col] != p) winner = false;
        }
        asliWinner |= winner;
        winner = true;
        for(int i = 0, j = 0; j < size; i ++, j ++) {
            if(board[i][j] == null || board[i][j] != p) winner = false;
        }
        asliWinner |= winner;
        winner = true;
        for(int i = 0, j = 2; j >= 0; i ++, j --) {
            if(board[i][j] == null || board[i][j] != p) winner = false;
        }

        return asliWinner;
    }


}
