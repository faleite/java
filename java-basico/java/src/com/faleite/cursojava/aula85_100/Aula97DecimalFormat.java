package com.faleite.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);

        // Outra forma
        // df.applyPattern(padrao);
        System.out.println(df.format(1234567890.123)); // 1,234,567,890.12

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(1234567890.123)); // 1.234.567.890,12

        String padrao3 = "###,###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234567890.123)); // 12.3456.7890,12

        String padrao4 = "\u00A4###,###,###.00%";
        //String padrao4 = "###,###,###.00%";
        //String padrao4 = "###,###,###.00";
        // String padrao4 = "###,###,##0.00";
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(1234567890.1)); // 1.234.567.890,10
        System.out.println(df.format(0.1)); // ,10 // 0,10 // 10.00% // ¤10,00%
    }
}
