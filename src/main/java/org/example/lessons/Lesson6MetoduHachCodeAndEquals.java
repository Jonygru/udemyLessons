package org.example.lessons;

import org.example.lessons.helpers.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson6MetoduHachCodeAndEquals {
    public void foo(){
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
        String a =  "Работяга";
        String b = "Работяга";

        Person person1 = new Person(1, "Женя", a);
        Person person2 = new Person(1, "Женя", b);

        map.put(person1, "Работяга");
        map.put(person2, "Автотестер");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
