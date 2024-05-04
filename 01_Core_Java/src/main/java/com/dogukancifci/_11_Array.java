package com.dogukancifci;

import java.sql.Array;

public class _11_Array {
    public static void main(String[] args) {


        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);


        int[] arr = {5, 4, 3, 2, 1, 0};
        System.out.print(arr[0]);
        System.out.println();


        // Iterative For
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(" ");
        
        //for each
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
