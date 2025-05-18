package com.faleite.cursojava.aula20;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

    public static boolean winner(char[][] game, char player){
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

    public static boolean validNumber(byte num){
        return num < 1 || num > 3;
    }

    public static void showGame(char[][] game){
        for (char[] chars : game) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }

    public static void fillGame(char[][] game){
        for (char[] chars : game) {
            Arrays.fill(chars, '_');
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] game = new char[3][3];
        boolean win = false;
        char player = 'X';
        byte tie = 0;

        fillGame(game);
        System.out.println("Jogo da Velha");

        while (!win) {

            byte line = -1;
            byte column = -1;

            System.out.println("E a vez de " + player);
            while (validNumber(line)) {
                System.out.println("Digite a posição da linha (1-3): ");
                line = scan.nextByte();
            }
            while (validNumber(column)) {
                System.out.println("Digite a posição da coluna (1-3): ");
                column = scan.nextByte();
            }
            if (game[--line][--column] != '_'){
                System.out.println("Posição ja usada, tente novamente.");
                continue;
            }
            game[line][column] = player;
            if (winner(game, player)) {
                System.out.println(player + " Venceu!!!");
                win = true;
            }
            showGame(game);
            tie++;
            if (tie > 8){
                System.out.println("Não houve vencedor!!!");
                break;
            }
            player = (player == 'X') ? 'O' : 'X';
        }
    }
}
