package com.dogukancifci;


import java.util.Random;

public class _4_Math {

    public static void main(String[] args) {

        // Math
        System.out.println(Math.min(3,4));
        System.out.println(Math.max(4,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(4));
        System.out.println(Math.addExact(3,4));
        System.out.println(Math.ceil(3.44));
        System.out.println(Math.exp(2.555));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(3,4));

        // Random

        System.out.println(Math.random()*4+1);
        System.out.println( Math.ceil(Math.random()*4+1) );

        Random random= new Random();
        System.out.println(random.nextInt(3));


        
    }
}