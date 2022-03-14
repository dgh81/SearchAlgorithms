package com.company;

public class QuickSearch {
//Binary search:
    public static String BinSearch(String[] strArray, String s) {
        boolean x = false; //initializing x to false
        int in = 0; //declaration of index variable

        // Iteration of the String Array
        for (int i = 0; i < strArray.length; i++) {
            if (s.equals(strArray[i])) {
                in = i;
                x = true;
                break;
            }
        }
        if (x) {
            //System.out.println("\"" + "s\"" + " String is found at index " + in);
            return "\"" + s + "\"" + " String is found at index " + in;
        }
        else {
            //System.out.println("\"" + "s\"" + " String is not found in the array");
            return "\"" + s + "\"" + " String is not found in the array";
        }
    }

//Linear Search
    public static String LinSearch(String[] strArray, String s) {
        int in = 0;
        String result = "";
        for (String ss : strArray) {
            if (s.equalsIgnoreCase(ss)) {
                in++;
                 result = "\"" + s + "\"" + " String is found at index " + in;
                 break;
            } else {
                in++;
                result = "\"" + s + "\"" + " String is not found. (Index at:) " + in;
            }

        }
        return result;
    }

    public static void bubbleSortString(String[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                //if (list[i] > list[i + 1]) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    String temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
}
