package com.faleite.cursojava.aula27;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha game = new JogoDaVelha();

        game.fillGame(game.game);

        System.out.println("Jogo da Velha");

        while (!game.win) {
            byte line = -1;
            byte column = -1;

            System.out.println("E a vez de " + game.player);
            while (game.validNumber(line)) {
                System.out.println("Digite a posição da linha (1-3): ");
                line = scan.nextByte();
            }
            while (game.validNumber(column)) {
                System.out.println("Digite a posição da coluna (1-3): ");
                column = scan.nextByte();
            }
            if (game.game[--line][--column] != '_'){
                System.out.println("Posição ja usada, tente novamente.");
                continue;
            }
            game.game[line][column] = game.player;
            if (game.winner(game.game, game.player)) {
                System.out.println(game.player + " Venceu!!!");
                game.win = true;
            }
            game.showGame(game.game);
            game.tie++;
            if (game.isTie()){
                break;
            }
            game.changePlayer();
        }
    }
}
