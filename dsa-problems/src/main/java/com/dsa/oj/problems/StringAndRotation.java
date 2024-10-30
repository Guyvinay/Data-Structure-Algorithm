package com.dsa.oj.problems;

import java.util.*;
public class StringAndRotation {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String s1 = str2.substring(0,str2.length()/2);
        String s2 = str2.substring(str2.length()/2,str2.length());
        System.out.println(str1.equals(s2+s1)?"Yes":"No");
        sc.close();
    }
}
