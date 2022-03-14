package com.company;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

    public int compare(Student s1,Student s2){
        return s1.fnavn.compareTo(s2.fnavn);
    }

}
