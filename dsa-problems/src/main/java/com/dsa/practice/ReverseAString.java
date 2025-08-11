package com.dsa.practice;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "SpringBoot";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }

    private static String reverseString(String str) {
        char[] charArr = str.toCharArray();
        int l = 0;
        int r = charArr.length-1;

        while (l<r) {
            char temp = charArr[l];
            charArr[l] = charArr[r];
            charArr[r] = temp;
            l++;
            r--;
        }
        return new String(charArr);
    }
}
