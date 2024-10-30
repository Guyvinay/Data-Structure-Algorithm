package com.dsa.oj.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    

    public ImplementStackUsingQueue(Queue<Integer> queue1, Queue<Integer> queue2) {
        this.queue1 = queue1;
        this.queue2 = queue2;
    }

    public void push(int data){

        queue2.add(data);
        while(!queue1.isEmpty())queue2.add(queue1.poll());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    public void pop(){
        if(!queue1.isEmpty())queue1.poll();
    }

    public int top(){
        if(!queue1.isEmpty()) return queue1.peek(); 
        return -1;
    }

}
