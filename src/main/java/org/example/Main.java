package org.example;

import org.example.mnogopotochnost.lesson1.MyThread;
import org.example.mnogopotochnost.lesson1.Runner;
import org.example.mnogopotochnost.lesson2synchronaized.Test;
import org.example.mnogopotochnost.lesson2synchronaized.Work;
import org.example.mnogopotochnost.lesson2synchronaized.Worker;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        myThread.shutdown();

//        Thread thread = new Thread(new Runner());
//        thread.start();
//        System.out.println("text from main thread");


//        Test test = new Test();
//        test.doWork();

 //           new Worker().main(1000);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 7; i++){
            executorService.submit(new Work(i));
        }

        executorService.shutdown();
        System.out.println("All tasks submited");

        executorService.awaitTermination(1, TimeUnit.SECONDS); // через 5 sec перестанут выполняться потоки

    }
}