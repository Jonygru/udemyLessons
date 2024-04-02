package org.example.lessons;

import java.util.Stack;

public class Lesson9classStack {
    public void foo(){
        Stack<Integer> stack = new Stack<>();
        stack.push(5); //Добавляет в начало элемент push
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());  //Достает последний добавленный элемент из стека pop
        System.out.println(stack.pop());  //Достает последний добавленный элемент из стека
        System.out.println(stack.pop());//Достает последний добавленный элемент из стека
        System.out.println(stack);
        System.out.println(stack.empty());

        stack.push(5); //Добавляет в начало элемент
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());  //Достает последний элемент из стека но не убмрает его peek
        System.out.println(stack);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
