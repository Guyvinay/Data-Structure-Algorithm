package com.dsa.oj.problems;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        
        int[] array = {0, 1, 0, 3, 12};

        int pt = 0;

        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[pt]=array[i];
                pt++;
            }
        }
        while (pt<array.length) {
            array[pt]=0;
            pt++;
        }
        System.out.println(Arrays.toString(array));
    }
}
