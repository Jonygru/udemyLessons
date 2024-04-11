package org.example.mnogopotochnost.lesson2synchronaized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public  void addToListOne1(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }
    public void addToListOne2(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work(int count){
        for (int i = 0; i < count; i++) {
            addToListOne1();
            addToListOne2();
        }
    }
    public void main(int countWork){
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work(countWork);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work(countWork);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long after = System.currentTimeMillis();
        //Выводы в консоль данных
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("Size List1: " + list1.size());
        System.out.println("Size List2: " + list2.size());
    }
}
