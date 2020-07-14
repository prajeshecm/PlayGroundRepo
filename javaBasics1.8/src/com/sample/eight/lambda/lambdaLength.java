package com.sample.eight.lambda;

public class lambdaLength {


    public static void main(String[] args) {
        Mylamdalenghth lambdaLength = s -> s.length();
        System.out.println("lambdaLength :: "+lambdaLength.getStrLength("My first Lambda"));
    }


    interface Mylamdalenghth{
        int getStrLength(String s);
    }
}
