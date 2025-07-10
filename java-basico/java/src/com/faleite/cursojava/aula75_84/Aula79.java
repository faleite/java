package com.faleite.cursojava.aula75_84;

public class Aula79 {

    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x')); // -1
        System.out.println(banana.indexOf('a')); // 1
        System.out.println(banana.indexOf('b')); // 0

        System.out.println(banana.indexOf(ana)); // 1

        System.out.println(banana.lastIndexOf('a')); // 5
        System.out.println(banana.lastIndexOf(ana)); // 3
        System.out.println(banana.lastIndexOf('x')); // -1

        System.out.println(banana.contains(ana)); // true
        System.out.println(banana.contains("ceu")); // false
    }
}
