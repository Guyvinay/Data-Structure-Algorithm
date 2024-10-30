package com.dsa.oj.array;


public class EquilibriumElement {
    public static void main(String[] args) {
        String[] arr = new String[]{"15","1","5","5","5"};
        int ans = equilibriumElement(5,arr);
        System.out.println(ans);
    }
    public static int equilibriumElement(int num, String[] arr ){
        for(int i=1; i<num; i++){
            int sum1 = sumEle(0,i-1,arr);
            int sum2 = sumEle(i+1,num-1,arr);
            if(sum1==sum2)return i;
        }
        return -1;
    }
    private static int sumEle(int i, int j, String[] arr) {
        int sum = 0;
        for(int a=i; a<=j; a++ ){
            sum+=Integer.parseInt(arr[a]);
        }
        return sum;
    }
}
