package com.alexbt.algos.queue;

import java.util.Stack;

public class QueueImplWithStacks2<T> {
    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();

    public void enqueue(T val) {
        s1.push(val);
    }

    public T dequeue() {
        prep();
        return s2.pop();
    }

    public T peek() {
        prep();
        return s2.peek();
    }

    private void prep() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}
