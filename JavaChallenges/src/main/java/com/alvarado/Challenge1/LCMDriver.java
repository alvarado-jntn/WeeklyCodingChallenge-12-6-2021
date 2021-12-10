package com.alvarado.Challenge1;

import java.util.ArrayList;
import com.alvarado.Challenge1.LeastCommonMultiple;

public class LCMDriver {
    private static LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

    public static void main(String[] args) {
        int[] list1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int[] list2 = {46, 54, 466, 544};
        int[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] list4 = {13, 6, 17, 18, 19, 20, 37};
        int[] list5 = {8,18,68};

//        leastCommonMultiple.lcmOfArray(list1);
//        System.out.println("=======================================");
//
//        leastCommonMultiple.lcmOfArray(list2);
//        System.out.println("=======================================");
//
//        leastCommonMultiple.lcmOfArray(list3);
//        System.out.println("=======================================");

        leastCommonMultiple.lcmOfArray(list5);
        System.out.println("=======================================");








    }


}
