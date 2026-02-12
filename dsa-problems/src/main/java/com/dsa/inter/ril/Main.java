package com.dsa.inter.ril;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(3, "3");
        map.put(2, "2");
        map.put(1, "1");
        map.put(4, "3a");
        map.put(5, "3a");
        map.put(5, "3a");

        System.out.println(map.get(3));

        System.out.println(map.size());
    }
}
