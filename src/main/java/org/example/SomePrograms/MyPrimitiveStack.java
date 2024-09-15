package org.example.SomePrograms;

import java.util.ArrayList;
import java.util.List;

public class MyPrimitiveStack {
    private int size;
    private List<Integer> stackArray;

    public MyPrimitiveStack(int size) {
        this.size = size;
        stackArray = new ArrayList<>();
    }

    public void addElement(int s) {
        if (stackArray.size() == size) {
            doStackBigger();
        } else {
             stackArray.add(s);
        }
    }

    public void delete() {
        System.out.println(stackArray.get(stackArray.size() - 1));
        stackArray.remove(stackArray.size() - 1);
    }

    public int showElement() {
        System.out.println(stackArray.get(stackArray.size() - 1));
        return stackArray.get(stackArray.size() - 1);
    }

    public int doStackBigger() {
       return size *= 2;
    }

    public void stackSize() {
        System.out.println(size);
    }
    
}