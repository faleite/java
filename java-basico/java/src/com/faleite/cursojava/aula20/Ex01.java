package com.faleite.cursojava.aula20;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args){
        int[][] randomNumbers = new int[4][4];
        Random random = new Random();
        int majorNum = 0;
        int line = 0;
        int column = 0;

        for (int i = 0; i < randomNumbers.length; i++){
            for (int j = 0; j < randomNumbers[i].length; j++){
                randomNumbers[i][j] =  random.nextInt(9);
                System.out.print(randomNumbers[i][j] + " ");
                if (randomNumbers[i][j] > majorNum){
                    majorNum = randomNumbers[i][j];
                    line = i;
                    column = j;
                }
            }
            System.out.println();
        }
        System.out.println("Maior numero da matriz: " + majorNum);
        System.out.println("Esta na linha: " + line + ", da coluna: " + column);
    }
}
