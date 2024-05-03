package com.dogukancifci;



public class _5_String {

    public static void main(String[] args) {

        // String method
        String vocabulary=" java OGREniyoRum java";
        System.out.println(vocabulary);
        System.out.println(vocabulary.length());
        System.out.println(vocabulary.trim().length());

        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());

        System.out.println(vocabulary.charAt(1));
        System.out.println(vocabulary.indexOf("java"));
        System.out.println(vocabulary.lastIndexOf("java"));
        System.out.println(vocabulary.lastIndexOf("Dogukan Cifcik"));

        System.out.println(vocabulary.substring(2));
        System.out.println(vocabulary.substring(2,5));

        System.out.println(vocabulary.startsWith(" "));
        System.out.println(vocabulary.endsWith("k"));

        System.out.println(vocabulary.concat(" Sona Eklendi"));
        vocabulary=vocabulary.concat(" Sona Eklendi");
        System.out.println(vocabulary);

        System.out.println(vocabulary.contains("java"));
        System.out.println(vocabulary.replace(vocabulary,"xyz"));

    }
}