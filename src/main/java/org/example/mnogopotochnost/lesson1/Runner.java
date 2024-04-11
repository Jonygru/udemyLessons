package org.example.mnogopotochnost.lesson1;

public class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Runner" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
