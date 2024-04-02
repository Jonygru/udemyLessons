package org.example.lessons;

import java.util.ArrayList;

public class Lesson1 {
    public void foo(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = -1; i <=  10; i++){
            System.out.println(list.add(i));
        }
        list.remove(1);
        System.out.println(list);

    }
}
