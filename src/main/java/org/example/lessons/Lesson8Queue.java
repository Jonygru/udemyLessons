package org.example.lessons;

import org.example.lessons.helpers.Person;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson8Queue {
    public void foo(){
        Person person1 = new Person(1,"Evgene", "AQA");
        Person person2 = new Person(2,"Alena", "SEO");
        Person person3 = new Person(3,"Lola", "Walker");
        Person person4 = new Person(4,"GAren", "Witcher");

        Queue<Person> personQueue = new ArrayBlockingQueue<Person>(3);

        System.out.println(personQueue.offer(person3));
        System.out.println(personQueue.offer(person2));
        System.out.println(personQueue.offer(person1));
        System.out.println(personQueue.offer(person4));
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());

//        System.out.println(personQueue.remove()); //получить первый объект из очереди и удалить его
//        System.out.println(personQueue.peek()); // Посмотреть на первый объект в очереди но при этом оставить его там
//        System.out.println(personQueue.remove());
//        System.out.println(personQueue.remove());
    }
}
