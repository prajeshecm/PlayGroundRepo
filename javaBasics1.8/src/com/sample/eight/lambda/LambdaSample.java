package com.sample.eight.lambda;

public class LambdaSample {

        interface CalcAddNumbers
        {
           int calNumbersMethod  (int a , int b , int c) ;
        }

        interface  GetMultiplymath
        {
            int getMathMethod(int a , int b) ;
        }

        interface SayHi
        {
            String sayHiMethod(String message);
        }

        public int getWrapper (int a , int b , GetMultiplymath getMath) {
            int c = a + b ;
            System.out.println("a: " +a+" , b : "+b );
            return getMath.getMathMethod(a,b);
        }

        public int getWrapperForMultiply (int a , int b , int c ,  CalcAddNumbers calcNumbers) {
        System.out.println("a: " +a+" , b : "+b + " ,C :"+c);
        return calcNumbers.calNumbersMethod(a,b,c );
    }

    public static void main(String[] args) {

        CalcAddNumbers calAddNum = (a,b,c) -> {
            int d =  a + b + c;
            System.out.println("d value  " + d );
            return  d;
        };

        GetMultiplymath getMultiplymath = (a,b) -> {
            int d =  a * b ;
            System.out.println("d value for multiply :  " + d );
            return  d;
        };

        SayHi sayHi = (Str) -> {
            System.out.println("String Message :  " + Str );
            return Str;
        };

        LambdaSample lambdaSample = new LambdaSample();
        lambdaSample.getWrapper(10,5, getMultiplymath);
        System.out.println("-----------------------------------");
        sayHi.sayHiMethod("Praji");
        System.out.println("-----------------------------------");
        lambdaSample.getWrapperForMultiply(2,2,2, calAddNum);
        System.out.println("-----------------------------------");

    }

}

