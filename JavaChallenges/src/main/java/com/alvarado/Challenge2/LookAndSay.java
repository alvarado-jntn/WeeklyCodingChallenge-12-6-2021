package com.alvarado.Challenge2;

import java.math.BigInteger;

public class LookAndSay {

    public BigInteger lookAndSay (BigInteger input) {

        StringBuilder stringAnswer =  new StringBuilder();

        String stringInput = input.toString(); // string

        if (stringInput.length() % 2 == 0) { // if there is no remainder, then there is an even number of digits
            for (int i = 0; i<stringInput.length(); i +=2) {
//                System.out.println("i: " + i);
//                System.out.println("stringInput.charAt[i]: " + stringInput.charAt(i));
                for(int k = 0; k < Integer.parseInt(String.valueOf(stringInput.charAt(i))); k++){
//                    System.out.println("hi");
                    String entry = String.valueOf(stringInput.charAt(i+1));
                    stringAnswer.append(entry);

                }

            }

        } else {
            System.out.println(-1);
            return new BigInteger("-1");
        }

//        System.out.println("stringAnswer: " + stringAnswer);
        System.out.println(stringAnswer);

        return new BigInteger(String.valueOf(stringAnswer));
    }
}
