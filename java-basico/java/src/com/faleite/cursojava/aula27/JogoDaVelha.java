package com.faleite.cursojava.aula27;

import java.util.Arrays;

public class JogoDaVelha {
    char[][] game = new char[3][3];
    boolean win = false;
    char player = 'X';
    byte tie = 0;

    boolean winner(char[][] game, char player){
        if (game[0][0] == player && game[0][1] == player && game[0][2] == player)
            return true;
        else if (game[1][0] == player && game[1][1] == player && game[1][2] == player)
            return true;
        else if (game[2][0] == player && game[2][1] == player && game[2][2] == player)
            return true;
        else if (game[0][0] == player && game[1][0] == player && game[2][0] == player)
            return true;
        else if (game[0][1] == player && game[1][1] == player && game[2][1] == player)
            return true;
        else if (game[0][2] == player && game[1][2] == player && game[2][2] == player)
            return true;
        else if (game[0][0] == player && game[1][1] == player && game[2][2] == player)
            return true;
        else return game[0][2] == player && game[1][1] == player && game[2][0] == player;
    }

    boolean validNumber(byte num){
        return num < 1 || num > 3;
    }

    void showGame(char[][] game){
        for (char[] chars : game) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }

    void fillGame(char[][] game){
        for (char[] chars : game) {
            Arrays.fill(chars, '_');
        }
    }

    boolean isTie(){
        if (tie > 8){
            System.out.println("Não houve vencedor!!!");
            return true;
        }
        return false;
    }

    void changePlayer(){
        player = (player == 'X') ? 'O' : 'X';
    }
}