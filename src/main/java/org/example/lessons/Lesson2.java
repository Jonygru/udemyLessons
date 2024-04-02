package org.example.lessons;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson2 {
    public void foo(){
        List<Integer> linkedList = new LinkedList<>();

        List<Integer> arrayList = new ArrayList<>();




    }
    public  void measureTime(List<Integer> list){

        for (int i = 0; i < 10000000; i++){
            list.add( i);
        }
        long start = System.currentTimeMillis();
        list.remove(5000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
