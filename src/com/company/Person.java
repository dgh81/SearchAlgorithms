package com.company;

public class Person implements Comparable<Person>{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public int compareTo(Person p) {
        if(name==p.name)
            return 0;
        else if(name.compareTo(p.name)>0)
            return 1;
        else
            return -1;
    }
}
