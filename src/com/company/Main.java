package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

// Comparable Sort
        ArrayList<Person> unsortlist=new ArrayList<Person>();
        unsortlist.add(new Person("Daniel"));
        unsortlist.add(new Person("Thomas"));
        unsortlist.add(new Person("Jakob"));
        unsortlist.add(new Person("Susanne"));
        unsortlist.add(new Person("Gunnar"));
        unsortlist.add(new Person("Pernille"));
        unsortlist.add(new Person("Emma"));
        unsortlist.add(new Person("Ida"));
        unsortlist.add(new Person("Ea"));
        unsortlist.add(new Person("Lise"));

        Collections.sort(unsortlist);
        for(Person p:unsortlist){
            System.out.println(p.name);
        }



        String[] strArray = new String[]{"Daniel","Thomas", "Jakob", "Susanne", "Gunnar", "Pernille", "Emma", "Ida", "Ea", "Lise"};
        //Binary search
        System.out.println(QuickSearch.BinSearch(strArray, "Ida"));

        //Linear Search
        System.out.println(QuickSearch.LinSearch(strArray, "Thomas"));


        ArrayList<Student> unsortlist2=new ArrayList<Student>();
        unsortlist2.add(new Student(1,"Daniel", "Guldberg", 9.3));
        unsortlist2.add(new Student(2, "Thomas", "Hansen", 8.9));
        unsortlist2.add(new Student(3,"Jakob", "Jensen", 4.7));
        unsortlist2.add(new Student(4,"Susanne", "Hammershøj", 7.7));
        unsortlist2.add(new Student(5,"Gunnar", "Klaphat", 5.5));
        unsortlist2.add(new Student(6,"Pernille", "Hansen", 9.9));
        unsortlist2.add(new Student(7,"Emma", "Hanson", 4.4));
        unsortlist2.add(new Student(8,"Ida", "Nossefår", 5.5));
        unsortlist2.add(new Student(9,"Ea", "Easen", 8.5));
        unsortlist2.add(new Student(10,"Lise", "Lottesen", 6.5));

        //Interface Comparable:
        Collections.sort(unsortlist2);
        for(Student s:unsortlist2){
            System.out.println(s.fnavn);
        }

        //Interface Comparator:
        Collections.sort(unsortlist2,new NameComparator());
        for(Student s:unsortlist2){
            System.out.println(s.fnavn);
        }


        //BubbleSortString
        String[] strArray2 = new String[]{"Daniel","Thomas", "Jakob", "Susanne", "Gunnar", "Pernille", "Emma", "Ida", "Ea", "Lise"};

        QuickSearch.bubbleSortString(strArray2);
        for (String s : strArray2) {
            System.out.println(s);
        }
    }

}


/*

    2.	Lav et program, hvor der i main erklæres et string array og der indsættes 10 strenge i arrayet.
        Programmer nu de forskellige sorteringsalgoritmer, så de kan sortere arrays af strenge.
        Test sorteringsalgoritmerne med det oprettede array af strenge.

    3.	Programmer lineær søgning og binær søgning, så de kan søge efter strenge.
        Test disse funktioner med søge i arrayet fra opgave 1.

    4.	Opret en klasse person, med egenskaber stdnr, fnavn, enavn, gennemsnitkar.
        Opret et array i main, som kan indeholde person-objekter. Tilret nu de forskellige sorteringsalgoritmer,
        så de kan sortere på stdnr eller fnavn, eller enavn eller gennemsnitskar.
        Test sorteringsalgoritmerne med det oprettede array af personer.

    5.	Løs opgave 3 hvor der anvendes interfacet Comparator.

    6.	Løs opgave 3 hvor der anvendes interfacet Comparable.
*/
