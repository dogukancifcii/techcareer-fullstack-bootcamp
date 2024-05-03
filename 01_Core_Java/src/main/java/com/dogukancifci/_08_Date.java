package com.dogukancifci;


import java.util.Date;

public class _08_Date {

    public static void main(String[] args) {

        //Date
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getHours() + ":" + date.getMinutes());
        date.setHours(17);
        System.out.println(date.getHours() + ":" + date.getMinutes());
        System.out.println(date.getHours() + ":" + date.getMinutes() + " " + (date.getYear() + 1900));
        //year = date.getYear() + 1900


    }
}