package com.sample.eight.methodReference;

public class ConstMethodRefPrac {

    interface  ConstInterfaceMessgae {
        void showMessgae(String message);
    }

      ConstMethodRefPrac  (String message){
        System.out.println("Message :::"+message);
      }

    public static void main(String[] args) {
        //Call the lambda constructor Method by constructor Reference.
        ConstInterfaceMessgae messageVar =  ConstMethodRefPrac::new;
        messageVar.showMessgae("constructor Method Called SuccessFully");
    }

}
