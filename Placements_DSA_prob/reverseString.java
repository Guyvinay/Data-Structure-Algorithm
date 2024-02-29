package Placements_DSA_prob;

public class reverseString {
    public static void main(String[] args) {
        String str = "string";
        char[] arr = str.toCharArray();
        int i=0,j=arr.length-1;
        while (i<=j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        System.out.println(new String(arr));
    }
}
