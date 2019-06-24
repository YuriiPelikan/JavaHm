package com.softserve.HOMEWORK.Collections.n1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Karent", "Stepan");
        personMap.put("Trash", "Yarik");
        personMap.put("Ronaldo", "Vitalia");
        personMap.put("Torres", "Orest");
        personMap.put("Kovalev", "Andriy");
        personMap.put("Teard", "Ustym");
        personMap.put("Komoae", "Olia");
        personMap.put("Gfew", "Petya");
        personMap.put("Delete", "Orest");
        personMap.put("Referee", "Kolia");
        System.out.println("First view");
        System.out.println(personMap);

        Set<Map.Entry<String, String>> set = personMap.entrySet();

        String firstName = personMap.get(0);

        String name = "Orest";
        List<String> keyByName = new LinkedList<>();
        for (Map.Entry<String, String> e : set) {
            if (e.getValue() == name) {
                keyByName.add(e.getKey());
            }
        }
        for (String key : keyByName) {
            personMap.remove(key);
        }
        System.out.println("After deleting Orest");
        System.out.println(personMap);


    }
}
