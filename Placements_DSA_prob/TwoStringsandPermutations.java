package Placements_DSA_prob;
import java.util.*;
public class TwoStringsandPermutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        System.out.println(s1.equals(s2)?"Yes":"No");
    }
}
