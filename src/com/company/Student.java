package com.company;

import java.util.Collection;

public class Student implements Comparable<Student> {
    int stdnr;
    String fnavn;
    String enavn;
    double gennemsnitskar;

    public Student(int stdnr, String fnavn, String enavn, double gennemsnitskar) {
        this.stdnr = stdnr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.gennemsnitskar = gennemsnitskar;
    }

    public int compareTo(Student s){
        if (fnavn == s.fnavn) {
            return 0;
        } else if (fnavn.compareTo(s.fnavn) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
/*
    public int compareTo(Student s){
        if (enavn == s.enavn) {
            return 0;
        } else if (enavn.compareTo(s.enavn) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareTo(Student s){
        if (stdnr == s.stdnr) {
            return 0;
        } else if (stdnr.compareTo(s.stdnr) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareTo(Student s){
        if (gennemsnitskar == s.gennemsnitskar) {
            return 0;
        } else if (gennemsnitskar.compareTo(s.gennemsnitskar) > 0) {
            return 1;
        } else {
            return -1;
        }
    }*/
}
