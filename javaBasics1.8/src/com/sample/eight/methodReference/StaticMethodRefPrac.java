package com.sample.eight.methodReference;

import java.util.function.BiFunction;

public class StaticMethodRefPrac {

    public static int getAddNumbers (int a ,int b){
        System.out.println(" A & B are : "+a +", b :" +b);
        int c = a + b ;
        System.out.println("Total value are : "+c);
        return c;
    }

   // BiFunction<Integer,Integer,Integer> funVal = (a,b) -> a+b ;

    public static void main(String[] args) {
        StaticMethodRefPrac prac = new StaticMethodRefPrac();
        //Call the lambda static Method by static Reference.
        BiFunction<Integer,Integer,Integer> funVal = StaticMethodRefPrac::getAddNumbers;
        Integer total = funVal.apply(50,50);
        System.out.println("total : "+total);
    }
}
