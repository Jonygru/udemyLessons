package org.example.lessons;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson5setCollection {
    public void foo(){
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();



        hashSet1.add(0);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        System.out.println("Первое множество: " + hashSet1);


        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);
        System.out.println("Второе множество: " + hashSet2);

        // union -- объединение множеств
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println("Объединение множеств: " + union);

        // intersection -- пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println("Пересечение множеств: " + intersection);

        // difference -- разность множеств
        Set<Integer> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println("Разность множеств: " + difference);
    }

}
