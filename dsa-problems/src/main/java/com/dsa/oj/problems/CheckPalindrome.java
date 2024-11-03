package com.dsa.oj.problems;


import java.util.Scanner;
class CheckPalindrome {
    public static void main(String[] args){
        isStringPalindrome();
        isNumberPalindrome(121);
    }

    private static void isStringPalindrome() {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextInt();
            String str = sc.next();
            // System.out.println(n+" "+str);
            int l = 0, r = str.length()-1;
            while(r>l) {
                if(str.charAt(l)!=str.charAt(r)) {
                    System.out.println("No");
                    return;
                }
                l++;
                r--;
            }
        }
        System.out.println("Yes");
    }

    public static boolean  isNumberPalindrome(int num) {
        while (num >= 0) {
            int  rem = num%10;
            System.out.println(rem);
        }
        return true;
    }

}