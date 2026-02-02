package com.dsa.neetocde;

public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfAString("neetcode"));
    }

    private static int scoreOfAString(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return res;
    }
}
