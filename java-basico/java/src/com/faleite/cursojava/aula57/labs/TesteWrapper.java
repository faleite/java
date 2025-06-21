package com.faleite.cursojava.aula57.labs;

public class TesteWrapper {

    public static void main(String[] args) {

        // Variaveis do tipo primitivo

        // Numeros inteiros
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;

        // Numeros de ponto flutuante
        float num5 = 3.5f;
        double num6 = 3.55555;

        boolean flag = true;
        char a = 'a';

        // Wrappers

        // Depreciado
        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 =  new Boolean(true);
        Character b = new Character('b');

        // Forma atual
        Short num7a = Short.valueOf((short) 1);
        Byte num8a = Byte.valueOf((byte) 10);
        Integer num9a = Integer.valueOf(100);
        Long num10a = Long.valueOf(10000l);
        Float num11a = Float.valueOf(3.5f);
        Double num12a = Double.valueOf(3.5555);
        Boolean flag2a =  Boolean.valueOf(true);
        Character ba = Character.valueOf('b');

        // Ou
        Short num7b = (short) 1;
        Byte num8b = (byte) 10;
        Integer num9b = 100;
        Long num10b = 10000l;
        Float num11b = 3.5f;
        Double num12b = 3.5555;
        Boolean flag2b = true;
        Character bb = 'b';

        Integer num13 = Integer.valueOf("10000");
        Double num14 = Double.valueOf("3.5");

        System.out.println(num13.intValue());
        System.out.println(num13.longValue());

        Long num15 = num13.longValue();
        int num16 = Integer.parseInt("100000");

        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);

    }
}
