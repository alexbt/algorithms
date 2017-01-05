package com.alexbt.algos.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplWithQueueOptimizedForPop<T> {

    private Queue<T> readyToPush = new LinkedList<>();
    private Queue<T> readyToPop = new LinkedList<>();

    public T pop() {
        return readyToPop.remove();
    }

    public void push(T element) {
        readyToPush.add(element);
        while (!readyToPop.isEmpty()) {
            readyToPush.add(readyToPop.remove());
        }
        readyToPop = readyToPush;
    }
}
