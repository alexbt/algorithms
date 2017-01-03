package com.alexbt.algos.queue;

import java.util.Stack;

class QueueImplWithStacks<T> {
    private Stack<T> push = new Stack<>();
    private Stack<T> pop = new Stack<>();

    public void enqueue(T val) {
        push.push(val);
    }

    public T dequeue() {
        prep();
        return pop.pop();
    }

    public T peek() {
        prep();
        return pop.peek();
    }

    private void prep() {
        if (pop.isEmpty()) {
            while (!push.isEmpty()) {
                pop.push(push.pop());
            }
        }
    }

}
