package org.example.SomePrograms;

import java.util.ArrayList;
import java.util.List;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        Runnable foo = () -> {
            Container container = new Container();
            for (int i = 0; i < 100000; i++) {
                container.addEntry("foo");
            }
        };
        List<Thread> threads = new ArrayList<>();
        for (long j = 0; j > 0; j--) {
            Thread thread = new Thread(foo);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        Container container = new Container();
        System.out.println(container.getList());

    }
}

class Container {
    private static final List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    synchronized void addEntry(String s) {
        list.add(s);
    }
}
