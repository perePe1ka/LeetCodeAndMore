package org.example.SomePrograms;

import java.util.ArrayList;
import java.util.List;

public class MyPrimitiveQueue {
    private int size;

    private List<Integer> queueArray;

    public MyPrimitiveQueue(int size) {
        this.size = size;
        queueArray = new ArrayList<>();
    }

    public void addElement(int s) {
        queueArray.add(s);
    }

    public void showAllQueue() {
        queueArray.stream().forEach(System.out::println);
    }

    public void deleteElement() {
        System.out.println("Удаляем элемент: " + queueArray.remove(0));
    }
}