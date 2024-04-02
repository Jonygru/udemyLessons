package org.example.lessons;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3CreateNewLinkedList {
    private Node head;
    private int size;

    /**
     * Добавление нового значения в конец списка
     * */
    public boolean add(int value){
        //Если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);
        }else{  //Если это уже не первое добавление, доходим до конца списка и последнему узлу добавляем ссылку на новой узел с переданным значением велью
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++; //Увеличение размера коллекции на 1 при добавление нового узла
        return true;
    }

    /**
     * Переопределение метода toString, чтобы в удобном виде просматривать содержимое нашего списка*/
    public String toString(){
        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        while (temp != null){
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    /**
     * Получение элемента коллекции*/
    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp != null){
            if(currentIndex == index){
                return temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IndexOutOfBoundsException();
    }
    /**
     * Удаление элемента коллекции*/
    public boolean remove(int index){
        if(index == 0) {
            head = head.getNext();
            size--;
            return true;
        }
        int currentIndex = 0;
        Node temp = head;

        if (index >= size)
            throw new IndexOutOfBoundsException();

        while(temp != null){
            if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return true;
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        return  true;
    }
  // [1] -> [2] -> [10]
    public int getSize() {
        return size;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
