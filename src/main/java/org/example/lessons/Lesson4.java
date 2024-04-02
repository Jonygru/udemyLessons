package org.example.lessons;

import java.util.*;

public class Lesson4 {
    public void foo(Map<Integer, String> map) {

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    public Map<Integer,String> testMap(Map<Integer, String> map){
        Random random = new Random();
        String[] names = {"Женя", "Алёна", "Валя","Гена","Жора","Эдик","Олег","Степан","Яна","Жуля"};
        for (int i = 0; i < 5; i++) {
            map.put(random.nextInt(100), names[random.nextInt(10)]);
        }
        return map;
    }

}
