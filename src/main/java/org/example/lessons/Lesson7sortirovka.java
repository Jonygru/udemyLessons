package org.example.lessons;

import org.example.lessons.helpers.IntegerDescComparatror;
import org.example.lessons.helpers.Person;
import org.example.lessons.helpers.StringLengthComparator;

import java.util.*;

public class Lesson7sortirovka {

       public void foo() {
           List<Person> peopleList = new ArrayList<>();
           Set<Person> peopleSet = new TreeSet<>();

           addElements(peopleList);
           addElements(peopleSet);
           Collections.sort(peopleList);
           System.out.println(peopleList);
           System.out.println(peopleSet);



       }

       private static void addElements(Collection collection){
           collection.add(new Person(4,"bob","worker"));
           collection.add(new Person(2,"zhenya","fooder"));
           collection.add(new Person(7,"anya","driver"));
           collection.add(new Person(1,"alise","walker"));
       }
}
