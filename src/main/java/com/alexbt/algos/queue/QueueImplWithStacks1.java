package com.alexbt.algos.queue;

import java.util.Stack;

public class QueueImplWithStacks1<T> {
    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();

    public void enqueue(T val) {
        while (!s1.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(val);
    }

    public T dequeue() {
        while (!s2.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public T peek() {
        while (!s2.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }
}
