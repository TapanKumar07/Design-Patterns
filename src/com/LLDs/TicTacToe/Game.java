package com.LLDs.TicTacToe;

import com.LLDs.TicTacToe.Pair;

import java.util.*;
import java.util.Scanner;

public class Game {
    gameBoard board;
    Deque<Player> players;
    Game() {
        players = new LinkedList<>();
        PieceX X = new PieceX();
        Player p1 = new Player(X, "Player1");
        players.add(p1);

        PieceO O = new PieceO();
        Player p2 = new Player(O, "Player2");
        players.add(p2);

        board = new gameBoard(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {
            Player playerTurn = players.getFirst();
            players.removeFirst();
            board.printBoard();

            List<Pair> freecells = board.getFreeCells();
            if(freecells.isEmpty()) {
                noWinner = true;
                continue;
            }
            System.out.println("Player : " + playerTurn.getName() + " Enter your cell : ") ;
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String [] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);
            row --;
            col --;

            boolean pieceAddSuccess = board.fill(row, col, playerTurn.getPeice());

            if(!pieceAddSuccess) {
                System.out.println("Wrong Cell Chosen Please Retry: ") ;
                players.addFirst(playerTurn);
                continue;
            }

            boolean Victory = board.victory(row, col, playerTurn.getPeice());
            if(Victory) {
                return playerTurn.getName();
            }
            players.add(playerTurn);
        }

        return "tie";
     }


}
