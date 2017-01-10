package com.alexbt.algos.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplWithQueueOptimizedForPop<T> {

    private Queue<T> enqueue = new LinkedList<>();
    private Queue<T> dequeue = new LinkedList<>();

    public T pop() {
        return dequeue.remove();
    }

    public void push(T element) {
        enqueue.add(element);

        while (!dequeue.isEmpty()) {
            enqueue.add(dequeue.remove());
        }

        Queue<T> tmp = dequeue;
        dequeue = enqueue;
        enqueue = tmp;
    }

    public static void main(String[] args) {
        StackImplWithQueueOptimizedForPop<Integer> stack = new StackImplWithQueueOptimizedForPop<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
