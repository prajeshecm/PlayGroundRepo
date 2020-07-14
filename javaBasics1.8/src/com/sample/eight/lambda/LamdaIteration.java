package com.sample.eight.lambda;

import java.util.*;
 class Example{

    public static void main(String[] args) {
        List<String> nameList=new ArrayList<String>();
        nameList.add("Rick");
        nameList.add("Negan");
        nameList.add("Daryl");
        nameList.add("Glenn");
        nameList.add("Carl");

        nameList.forEach((names)->System.out.println(names) ); // lambda expression
        System.out.println("--------------------------------------");
        nameList.forEach(System.out::println);  //Using method references.
        System.out.println("--------------------------------------");
        nameList.stream().forEachOrdered((names)->System.out.println(names));
    }
}
