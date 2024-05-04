package com.dogukancifci;

import java.util.*;

public class _12_Collection {

    // List: LinkedList,ArrayList, Vector
    // Set : HashSet,LinkedHashSet,TreeSet
    // Map : HashMap,LinkedHashMap,TreeMap

    // List: LinkedList,ArrayList, Vector
    // LIST
    public static void listData() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);

        System.out.println(numbers.size());
        System.out.println("4 var mi: " + numbers.contains(4));
        System.out.println("Bos mu: " + numbers.isEmpty());
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        // Java 8 Stream().api
        numbers.forEach(System.out::print);
    }

    // Set : HashSet,LinkedHashSet,TreeSet
    // SET
    public static void setData() {
        //Set<Integer> numbers=new HashSet<>();
        //Set<Integer> numbers=new LinkedHashSet<>();
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);

        System.out.println(numbers.size());
        System.out.println("6 var mi: " + numbers.contains(6));
        System.out.println("Bos mu: " + numbers.isEmpty());

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
        // Java 8 Stream().api
        numbers.forEach(System.out::print);
    }

    public static void mapData() {
        Map<String, String> mapList = new HashMap<>();
        mapList.put("1", "Samsun");
        mapList.put("2", "Ankara");
        mapList.put("3", "Izmir");
        mapList.put("4", "Van");

        // Key
        for (String key : mapList.keySet()) {
            System.out.println(key);
        }

        // Value
        for (String value : mapList.values()) {
            System.out.println(value);
        }

        // Key-Value
        for (String key : mapList.keySet()) {
            System.out.println(key + " => " + mapList.get(key));
        }

        mapList.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        //collection
        //listData();
        //setData();
        mapData();
    }
}
