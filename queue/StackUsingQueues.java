package com.day_02.queue;
import java.util.*;

public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            return -1; // Stack is empty
        }
        // Leave one element in queue1 and push the rest to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int top = queue1.remove();
        // Swap the names of the two queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    public int top() {
        if (queue1.isEmpty()) {
            return -1; // Stack is empty
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int top = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // Output: 3
    }
}
