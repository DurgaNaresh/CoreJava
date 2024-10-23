package com.durga.day22_Encapsulation.Encapsulation;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class HelloWorld {
    public static void main(String[] args) {

        customers cut = new customers();
        cut.setName("kavita ji");
        cut.setOrder(500);

        System.out.println("\n Customer Order : "+cut.getOrder());
        System.out.println(" \n Customer Name : "+cut.getName());

        cut.setName("mumtaz ji");
        cut.setOrder(960);

        System.out.println("\n Customer Order : "+cut.getOrder());
        System.out.println(" \n Customer Name : "+cut.getName());

    }
}

class customers{
    int order;
    String name;

    void setOrder(int order){
        this.order = order;
    }
    void setName(String name){
        this.name = name;
    }
    int getOrder(){
        return order;
    }
    String getName(){
        return name;
    }
}
