package Placements_DSA_prob;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int a = 0; a < n; a++) {
                arr[a] = sc.nextInt();
            }
            // System.out.println(Arrays.toString(arr));
            int ans = adamsAndSums(n, arr);
            System.out.println(ans);
        }
    }

    public static int adamsAndSums(int n, int[] arr) {
        int[] prefixSums = new int[n];
        prefixSums[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSums[i] += prefixSums[i - 1] + arr[i];
        }
        // System.out.println(Arrays.toString(prefixSums));
        // return 0;
        System.out.println(Arrays.toString(prefixSums));
        int[] suffixSums = new int[n];
        suffixSums[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSums[i] = suffixSums[i + 1] + arr[i];
        }
        System.out.println(Arrays.toString(suffixSums));
        int minIndex = 0;
        int minSum = prefixSums[0] + suffixSums[0];
        for (int i = 1; i < n; i++) {
            int currentSum = prefixSums[i] + suffixSums[i];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i;
            }
        }
        return minIndex + 1;
    }
}