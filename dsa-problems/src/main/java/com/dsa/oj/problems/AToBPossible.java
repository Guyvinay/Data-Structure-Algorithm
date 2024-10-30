package com.dsa.oj.problems;

public class AToBPossible {
    public String aToBPossible(int a , int b){

        while(b>a){
            if(b%2==0)b=b/2;
            else if(b%10==1) b = (b-1)/10;
            else break;
        }
        return a==b?"Possible":"Not Possible";

    }
    public static void main(String[] args) {
        AToBPossible ab = new AToBPossible();
        System.err.println(ab.aToBPossible(10 , 30));
    }
}
