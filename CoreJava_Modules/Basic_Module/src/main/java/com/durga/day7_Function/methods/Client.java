package com.durga.day7_Function.methods;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Client {
    //	- Non-Return type and Non Arguments
    void get_info() {

        System.out.println("codeswithpankaj.com");
        System.out.println(" this is java tutorial....");
        System.out.println("client info : name : joy ");
    }
    //	- Non-Return type and With Arguments

    void getresult(int price,int qt) {

        int mrp = price*qt;

        System.out.println("MRP : "+mrp);
    }

    //	- With Return type and Non Arguments

    int mrp() {

        return 900;
    }

    //	- With Return type and With Aruments

    long tax(long price,int gst) {

        long gst_price = (price*gst)/100;
        long total_amount = gst_price+price;

        return total_amount;
    }
}
