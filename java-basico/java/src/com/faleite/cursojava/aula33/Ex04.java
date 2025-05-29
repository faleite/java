package com.faleite.cursojava.aula33;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        System.out.println("Tic Tac Toe Game");

        while (!game.isWin()) {
            byte line = -1;
            byte column = -1;

            System.out.println("E a vez de " + game.getPlayer());
            while (game.validNumber(line)) {
                System.out.println("Digite a posição da linha (1-3): ");
                line = scan.nextByte();
            }
            while (game.validNumber(column)) {
                System.out.println("Digite a posição da coluna (1-3): ");
                column = scan.nextByte();
            }
            if (game.getTicTacToe()[--line][--column] != '_'){
                System.out.println("Posição ja usada, tente novamente.");
                continue;
            }
            game.getTicTacToe()[line][column] = game.getPlayer();
            if (game.winner()) {
                System.out.println(game.getPlayer() + " Venceu!!!");
                game.setWin(true);
            }
            game.showTicTacToe();
            game.setPlayNumber();
            if (game.isTie()){
                break;
            }
            game.changePlayer();
        }
    }
}
