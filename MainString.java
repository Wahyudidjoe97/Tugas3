package com.company;
import java.util.ArrayList;

public class MainString {
    public static void main(String [] args){
        ArrayList<String> strings = new  ArrayList<String> ();
        strings.add("Ini");
        strings.add("Adalah");
        strings.add("ArrayList");
        strings.add("String");
        String stringsss = strings.toString()
                .replace("[", "")
                .replace(",", "")
                .replace("]", "");

        System.out.println(stringsss);
        
    }
}