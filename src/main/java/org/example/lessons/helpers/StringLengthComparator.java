package org.example.lessons.helpers;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
            o1 > o2 ==> 1;
            o1 < o2 ==> -1;
            o1 == o2 ==> 0;
        */
        if(o1.length() > o2.length()){
            return 1;
        }else if(o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
