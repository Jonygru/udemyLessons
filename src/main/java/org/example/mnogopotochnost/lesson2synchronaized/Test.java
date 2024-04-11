package org.example.mnogopotochnost.lesson2synchronaized;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    private int counter;


    public int getCounter() {
        return counter;
    }


//     private synchronized void incrementCounter(){ Реализация метода, явно не указывая в каком объекте происходит синхронизация.
//        counter++;                                  (Она происходит в объекте this)
//     }

        private void incrementCounter() {
            synchronized (this) {
                counter++;
            }
        }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    incrementCounter();

                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++){
                    incrementCounter();
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
