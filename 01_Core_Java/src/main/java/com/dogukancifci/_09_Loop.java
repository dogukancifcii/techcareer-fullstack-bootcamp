package com.dogukancifci;

public class _09_Loop {
    //for loop
    public static void forLoop() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //for(;;){}
    }

    //while loop
    public static void whileLoop() {
        int i = 0;
        while (i < 10) {

            System.out.print(i + " ");
            i++;
            //i += 1;
            //i = i + 1;
        }
        //while(true){}
    }

    //doWhile
    public static void doWhileLoop() {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);
    }

    public static void main(String[] args) {
        forLoop(); //for
        System.out.println();
        whileLoop(); //while
        System.out.println();
        doWhileLoop(); //doWhile
    }
}
