package com.alexbt.algos.queue;

import java.util.Stack;

public class QueueImplWithStacks3<T> {
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
            Stack tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
    }
}
