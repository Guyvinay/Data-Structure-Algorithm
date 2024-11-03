package com.dsa.extrazz;

public class CountVowelsConstSpaces {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        count(str);
    }

    private static void count(String str) {
        int spaceCount = 0;
        int vowelsCount = 0;
        int consonentCount = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowelsCount++;
            else if (ch>='a' &&  ch<='z') consonentCount++;
            else if(ch==' ') spaceCount++;
        }
        System.out.println("spaces: " + spaceCount);
        System.out.println("vowels: " + vowelsCount);
        System.out.println("consonents : " + consonentCount);
    }
}
