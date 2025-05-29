package com.faleite.cursojava.aula33;

import java.util.Arrays;

public class TicTacToe {
    private char[][] ticTacToe;
    private boolean win;
    private char player;
    private byte playNumber;

    public TicTacToe() {
        this.ticTacToe = new char[3][3];
        this.win = false;
        this.player = 'X';
        this.playNumber  = 0;

        for (char[] chars : ticTacToe) {
            Arrays.fill(chars, '_');
        }
    }

    public char[][] getTicTacToe() {
        return ticTacToe;
    }

    public void setTicTacToe(char[][] ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public byte getPlayNumber() {
        return playNumber;
    }

    public void setPlayNumber() {
        this.playNumber++;
    }

    public boolean winner(){
        if (ticTacToe[0][0] == player && ticTacToe[0][1] == player && ticTacToe[0][2] == player)
            return true;
        else if (ticTacToe[1][0] == player && ticTacToe[1][1] == player && ticTacToe[1][2] == player)
            return true;
        else if (ticTacToe[2][0] == player && ticTacToe[2][1] == player && ticTacToe[2][2] == player)
            return true;
        else if (ticTacToe[0][0] == player && ticTacToe[1][0] == player && ticTacToe[2][0] == player)
            return true;
        else if (ticTacToe[0][1] == player && ticTacToe[1][1] == player && ticTacToe[2][1] == player)
            return true;
        else if (ticTacToe[0][2] == player && ticTacToe[1][2] == player && ticTacToe[2][2] == player)
            return true;
        else if (ticTacToe[0][0] == player && ticTacToe[1][1] == player && ticTacToe[2][2] == player)
            return true;
        else return ticTacToe[0][2] == player && ticTacToe[1][1] == player && ticTacToe[2][0] == player;
    }

    public boolean validNumber(byte num){
        return num < 1 || num > 3;
    }

    public void showTicTacToe(){
        for (char[] chars : ticTacToe) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }

    public boolean isTie(){
        if (playNumber > 8){
            System.out.println("Não houve vencedor!!!");
            return true;
        }
        return false;
    }

    public void changePlayer(){
        player = (player == 'X') ? 'O' : 'X';
    }
}
