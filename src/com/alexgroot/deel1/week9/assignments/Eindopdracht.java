package com.alexgroot.deel1.week9.assignments;

import java.util.ArrayList;
import java.util.List;

public class Eindopdracht implements Queue {

    List<Integer> queue = new ArrayList<>();

    @Override
    public void add(int value) {
        queue.add(value);
    }

    @Override
    public int remove(int index) {
        return queue.remove(index);
    }

    @Override
    public int peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void print() {
        System.out.println(queue);
    }

    @Override
    public void clear() {
        queue.clear();

    }

    @Override
    public void clear(int n) {
        for (int i = 0; i < n; i++) {
            queue.remove(0);
        }
    }

    @Override
    public void printReverse() {
        for (int i = queue.size() - 1; i >= 0; i--) {
            System.out.print(queue.get(i));
        }

    }

    @Override
    public void jumpTheQueue(int n, int value) {

        List<Integer> copy = List.copyOf(queue);

        List<Integer> lower = copy.subList(0, n);
        List<Integer> upper = queue.subList(n, copy.size());

        queue.clear();
        queue.addAll(lower);
        queue.add(value);
        queue.addAll(upper);
    }

    @Override
    public boolean equals(Queue q) {
        return queue == q;
    }

    @Override
    public int indexOf(int value) {
        return queue.indexOf(value);
    }

    @Override
    public int lastIndexOf(int value) {
        return queue.lastIndexOf(value);
    }
}
