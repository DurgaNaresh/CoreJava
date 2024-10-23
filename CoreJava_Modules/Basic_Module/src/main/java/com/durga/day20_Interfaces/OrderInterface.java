package com.durga.day20_Interfaces;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class OrderInterface implements InnerOrderInterface{
    public void getOrderID(){
        System.out.println("ORDER ID 10001");
    }

    public void getQTid(){
        System.out.println("QT ID A0099");
    }
    public static void main(String[] agr){
        OrderInterface oi = new OrderInterface();
        oi.getOrderID();
        oi.getQTid();
    }
}

interface InnerOrderInterface{

    public void getOrderID(); //methods...
    public void getQTid(); //methods...

}
