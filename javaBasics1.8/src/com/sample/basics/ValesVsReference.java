package com.sample.basics;

public class ValesVsReference {


    public static void main(String[] args) {

        int homerAge = 30;
           changeHomerAge(homerAge);
        System.out.println(homerAge);

            Customer customer1 = new Customer("praje",30); // will get some reference number for "customer1" of where the object stored in the memory.Let Assume as #12345#

            Customer customer2;  // here "customer2" will created in memory but not having any ref number just null because still "new" is not assigned for "customer2"

            customer2 = customer1; //** here java will use the "pass by value (Copy of the reference number from above customer1 whcih is #12345#) "

            System.out.println("Customer 2 "+ customer2+ " ,  customer1 : "+ customer1);

            customer2.changeCustomerDetails("prasad",35); //here customer2 is updating with the same refernce number #12345#  , so even customer1 refernce # is same so it will also get impacted , see below S.O.P

             System.out.println("After update , Customer 2 "+ customer2+ " ,  customer1 : "+ customer1);


    }

    static int changeHomerAge(int homerAge) {
        homerAge = 35;
        return homerAge;
    }
}
