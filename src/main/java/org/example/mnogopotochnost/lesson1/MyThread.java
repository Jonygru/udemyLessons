package org.example.mnogopotochnost.lesson1;

public class MyThread extends  Thread{
    private volatile boolean running = true;
    @Override
    public void run() {
        int i =0;
        while (running) {

                i++;
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        }
    }
    public void shutdown(){
        this.running = false;
    }
}
