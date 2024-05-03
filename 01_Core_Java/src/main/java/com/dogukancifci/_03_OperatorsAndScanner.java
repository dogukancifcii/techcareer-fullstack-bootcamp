package com.dogukancifci;

import java.util.Scanner;

public class _03_OperatorsAndScanner {

    public static void main(String[] args) {
        /*
        + - / * %
         */
        // Operator
        int a = 10, b = 4;

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));
        System.out.println("a % b: " + (a % b));
        // Scanner
        System.out.println("Lutfen adinizi giriniz");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Adiniz: " + name);
        //nextLine for String
        //nextIn for int


    }
}