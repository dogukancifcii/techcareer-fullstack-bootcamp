package com.dogukancifci;

import java.io.IOException;

public class _10_ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException, IOException {
        System.out.println("1.alan");
        System.out.println(0 / 22);
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException err) {
            System.out.println(err);
            err.printStackTrace();
        } catch (Exception err) {
            System.out.println(err);
            err.printStackTrace();
        } finally {
            System.out.println("2.alan");
        }
    }
}
