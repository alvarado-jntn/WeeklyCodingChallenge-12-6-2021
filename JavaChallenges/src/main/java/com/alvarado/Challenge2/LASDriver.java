package com.alvarado.Challenge2;

import java.math.BigInteger;

public class LASDriver {

    private static LookAndSay las = new LookAndSay();
    public static void main(String[] args) {
        String ex1 = "3132";
        String ex2 = "1213200012171979";
        String ex3 = "54544666";
        String ex4 = "95";
        String ex5 = "1213141516171819";
        String ex6 = "120520";
        String ex7 = "231";

        las.lookAndSay(new BigInteger(ex1));
        las.lookAndSay(new BigInteger(ex2));
        las.lookAndSay(new BigInteger(ex3));
        las.lookAndSay(new BigInteger(ex4));
        las.lookAndSay(new BigInteger(ex5));
        las.lookAndSay(new BigInteger(ex6));
        las.lookAndSay(new BigInteger(ex7));


    }
}
