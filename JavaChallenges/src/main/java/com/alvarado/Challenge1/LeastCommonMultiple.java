package com.alvarado.Challenge1;

import com.sun.javafx.image.IntPixelGetter;

import java.awt.print.PrinterGraphics;
import java.net.Inet4Address;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LeastCommonMultiple {

    public ArrayList<Integer> multiplesList(int num) {
        // this method generates a list of all the factors for a given number

        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 1; i < num + 1 ; i++) {
            if ( num % i == 0) {
                answerList.add(i);
            }
        }

//        System.out.println(answerList);
        return  answerList;
    }

    public Integer gcf (ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        // this method returns the largest number that is shared between 2 lists of integers
        int answer = 1;

        for (int i = 0; i<arr1.size(); i++ ) {
            for (int k = 0; k< arr2.size(); k++) {
                if (arr2.get(k).equals(arr1.get(i))) {
                    answer = arr2.get(k);
                }
            }
        }

//        System.out.println(answer);
        return answer ;
    }


    public TreeMap<Integer, Integer> factorCounts (int num) {
        // this method generates a map of primes for an input and how many of them exist

        TreeMap<Integer, Integer> factors = new TreeMap<>();

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        // list of prime numbers up to 100

        int dummyNum = num;

        for (int i = 0; i<primes.length; i++ ) {
            if (primes[i] <= num) {
                while ( dummyNum % primes[i] == 0) { // dummyNum is divisible by that prime
                    if (factors.containsKey(primes[i])) { // if that key already exists
                        int currentValue = factors.get(primes[i]);
//                        System.out.println("currentValue = " + currentValue);

                        int updatedValue = currentValue + 1 ;
//                        System.out.println("updatedValue = " + updatedValue);

                        factors.replace(primes[i],currentValue,updatedValue);

                        dummyNum = dummyNum / primes[i];
//                        System.out.println("dummyNum = " + dummyNum);

                    } else { // the key does not already exist
                        factors.put(primes[i], 1 );

                        dummyNum = dummyNum / primes[i];
//                        System.out.println("dummyNum = " + dummyNum);
                    }


                }
            }
        }

//        System.out.println(num + " | map of factors: " + factors);
        return factors;
    }



    public Integer lcmOfArray(int[] arr) {

        int lcm = 1 ;

        TreeMap<Integer, Integer> answerMap = new TreeMap<>();


        for (int i = 0; i < arr.length; i++) {

            ArrayList<Integer> keyList = new ArrayList<>(); // stores the keys in an iterable collection
            TreeMap<Integer, Integer> entry = factorCounts(arr[i]); // map of key:value pairs of factor:count

            // below is a way to get the keys into keyList in order to iterate through them later
            Set<Map.Entry<Integer, Integer>> loopAttempt = entry.entrySet();
            for (Map.Entry<Integer, Integer> la :loopAttempt){

                keyList.add(la.getKey());
            }

//            System.out.println("\nentry: " + entry);
//            System.out.println("keyList: " + keyList);

            for (int k = 0; k< keyList.size(); k++){

                int key = keyList.get(k);
//                System.out.println("key : " + key);



                if (answerMap.containsKey(key)) { // if the key already exists
                    int currentValue = answerMap.get(key);
                    int newValue = entry.get(key);

//                    System.out.println("currentValue : " + currentValue);
//                    System.out.println("newValue : " + newValue);


                    if (newValue > currentValue) {
                        answerMap.replace(key, currentValue, newValue);

//                        System.out.println("updated answerMap (key exists): " + answerMap + "\n");

                    } else {
//                        System.out.println("no update, current value is same or larger");
                    }
                } else  {
                    answerMap.put(key, entry.get(key));
//                    System.out.println("updated answerMap (key did not exist): " + answerMap + "\n");

                }
            }
        }

//        System.out.println("\nfinal answerMap: " + answerMap);

        // now iterate through the answerMap in order to multiply the keys and their count
        Set<Map.Entry<Integer, Integer>> answers = answerMap.entrySet();
        for (Map.Entry<Integer, Integer> a : answers) {
            int product = (int) Math.pow(a.getKey(), a.getValue());
            lcm = lcm * product ;
        }


        System.out.println("Lowest Common Multiple: " + lcm);
        return lcm ;

    }
}
