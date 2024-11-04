// package com.dsa.extrazz;

// public class CountVowelsConstSpaces {
// public static void main(String[] args) {
//     System.out.println("Program started");
//     String str = "The quick brown fox jumps over the lazy dog";
//     count(str);
//     System.out.println("Program ended");
// }

// private static void count(String str) {
//     System.out.println("Counting started");
//     int spaceCount = 0;
//     int vowelsCount = 0;
//     int consonentCount = 0;
//     for(int i=0; i<str.length(); i++) {
//         char ch = str.charAt(i);
//         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowelsCount++;
//         else if (ch>='a' &&  ch<='z') consonentCount++;
//         else if(ch==' ') spaceCount++;
//     }
//     System.out.println("spaces: " + spaceCount);
//     System.out.println("vowels: " + vowelsCount);
//     System.out.println("consonents : " + consonentCount);
//     System.out.println("Counting ended");
// }
package com.dsa.extrazz;

public class CountVowelsConstSpaces {
    public static void main(String[] args) {
        System.out.println("Program started");
        String str = "The quick brown fox jumps over the lazy dog";
        count(str);
        System.out.println("Program ended");
    }

    private static void count(String str) {
        System.out.println("Counting started");
        int spaceCount = 0;
        int vowelsCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) vowelsCount++;
            else if (isAlphabet(ch)) consonantCount++;
            else if (ch == ' ') spaceCount++;
        }
        System.out.println("spaces: " + spaceCount);
        System.out.println("vowels: " + vowelsCount);
        System.out.println("consonants: " + consonantCount);
        System.out.println("Counting ended");
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static boolean isAlphabet(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}