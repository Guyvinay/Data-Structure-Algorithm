package com.dsa.neetocde;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

//        System.out.println(validAnagram("racecar"));
        System.out.println(isAnagram("racecar", "arcecrs"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            int n = s.charAt(i) - 'a';
            int m = t.charAt(i) - 'a';
            arr[n]++;
            arr[m]--;
        }
        for(int n: arr) {
            if(n != 0) return false;
        }
        return true;
    }
    private static boolean validAnagram(String racecar) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char ch: racecar.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch,0) + 1);
            map2.put(ch, map2.getOrDefault(ch,0) + 1);
        }

        return map1.equals(map2);
    }

}
