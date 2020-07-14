package com.sample.eight.methodReference;

interface GetMessageDisplay
    {
        String showMessage(String messageVar);
    }

public class InstanceMethodRefPrac {
    public String sayHiLambda(String message){
        System.out.println("thanks for the  message : "+message);
        return  message.concat(" Instance Method Called SuccessFully ..");
    }

    public static void main(String[] args) {

        InstanceMethodRefPrac instanceMethodRefPracObj = new InstanceMethodRefPrac();

        //Call the lambda Method by instance Reference.
        GetMessageDisplay getMessageDisplayvar = instanceMethodRefPracObj::sayHiLambda;
        String finalMessageVar = getMessageDisplayvar.showMessage("helloooowwww");
        System.out.println("finalMessage  - > : "+finalMessageVar);


    }

}
