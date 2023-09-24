package com.LLDs.TicTacToe;

public class Player {
    PlayingPiece peice;
    String name;

    public Player(PlayingPiece peice, String name) {
        this.peice = peice;
        this.name = name;
    }

    public PlayingPiece getPeice() {
        return peice;
    }

    public void setPeice(PlayingPiece peice) {
        this.peice = peice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
