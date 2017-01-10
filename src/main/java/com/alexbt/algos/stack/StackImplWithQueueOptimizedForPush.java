package com.alexbt.algos.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplWithQueueOptimizedForPush<T> {

    private Queue<T> enqueue = new LinkedList<>();
    private Queue<T> dequeue = new LinkedList<>();

    public T pop() {
        while (dequeue.size() > 1) {
            enqueue.add(dequeue.remove());
        }
        T remove = dequeue.remove();
        Queue<T> tmp = dequeue;
        dequeue = enqueue;
        enqueue = tmp;
        return remove;
    }

    public void push(T element) {
        if (dequeue.isEmpty()) {
            dequeue.add(element);
        } else {
            enqueue.add(element);
        }
    }

    public static void main(String[] args) {
        StackImplWithQueueOptimizedForPush<Integer> stack = new StackImplWithQueueOptimizedForPush<>();
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
