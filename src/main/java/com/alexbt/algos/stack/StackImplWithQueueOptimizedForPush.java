package com.alexbt.algos.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplWithQueueOptimizedForPush<T> {

    private Queue<T> readyToPush = new LinkedList<>();
    private Queue<T> readyToPop = new LinkedList<>();

    public T pop() {
        T elem = readyToPush.remove();
        while (!readyToPush.isEmpty()) {
            readyToPop.add(elem);
            elem = readyToPush.remove();
        }

        return elem;
    }

    public void push(T element) {
        readyToPush.add(element);
    }
}
