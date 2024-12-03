package com.dsa.oj.stacks;

import java.util.*;

public class NewYearCelebration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            String[] nums = sc.nextLine().split(" ");
            int num = Integer.parseInt(nums[0]);
            switch(num) {
                case 1 : 
                    queue.add(Integer.parseInt(nums[1]));
                    break;
                case 2:
                    stack.push(Integer.parseInt(nums[1]));
                    break;
                case 3:
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.peek());
                    break;
                case 4:
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
                case 5:
                    if(!queue.isEmpty()) stack.push(queue.poll());
                    break;
            }
        }
        sc.close();
    }
}
