package com.dsa.extrazz;

public class AsciiValue {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        count(str);
        System.out.println("\n");
        countWithSpaces(str);
    }

    private static void count(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ": " + (int) str.charAt(i) + ", ");
        }
    }

    private static void countWithSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print("space: 32, ");
            } else {
                System.out.print(str.charAt(i) + ": " + (int) str.charAt(i) + ", ");
            }
        }
    }
}
/*
 * T: 84, h: 104, e: 101, s : 32, q: 113, u: 117, i: 105, c: 99, k: 107, : 32,
 * b: 98, r: 114, o: 111, w: 119, n: 110, : 32, f: 102, o: 111, x: 120, : 32, j:
 * 106, u: 117, m: 109, p: 112, s: 115, : 32, o: 111, v: 118, e: 101, r: 114, :
 * 32, t: 116, h: 104, e: 101, : 32, l: 108, a: 97, z: 122, y: 121, : 32, d:
 * 100, o: 111, g: 103,
 */