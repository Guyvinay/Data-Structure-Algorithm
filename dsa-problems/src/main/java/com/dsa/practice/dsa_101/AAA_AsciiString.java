package com.dsa.practice.dsa_101;

public class AAA_AsciiString {
    public static void main(String[] args) {
        String str = "All-convoYs-9-be:Alert1.";
//        String ans = encryptIt(str, 4);
//        System.out.println(ans);

//        String alan = alanAndChristopher("#ab#d");
//        System.out.println(alan);
        System.out.println(stringValue("abcd"));
    }

    private static int stringValue(String str) {
        char[] arr = str.toCharArray();
        int sum = 0;
        for (char ch: arr) {
            sum += charValueFromOne(ch);
        }
        return sum;
    }

    private static int charValueFromOne(char ch) {
        return ((ch - 'a') % 26 ) + 1;
    }

    private static String alanAndChristopher(String s) {
        char[] charArr = s.toCharArray();
        if(charArr[0] == '#') return "Ye cheating hai";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] == '#') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(charArr[i]);
            }
        }
        return sb.toString();
    }

    private static String encryptIt(String str, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char newChar = (char) ('A' + (ch - 'A' + shift) % 26);
                result.append(newChar);
            } else if (Character.isLowerCase(ch)) {
                char newChar = (char) ('a' + (ch - 'a' + shift) % 26);
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
