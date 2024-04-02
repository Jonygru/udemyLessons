package org.example.lessons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson10Iterable {
    public void foo(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        for(int x: list)
            System.out.println(x);
    }
}
