package com.durga.day16_Inheritance.Singleinheritance;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PrintBill {
    public static void main(String[] args) {
        product p = new product();
        p.ProductPrice();;
        p.gst();
    }
}

class tax{

    void gst(){
        System.out.println("18 %");
    }
}
class product extends tax{
    void ProductPrice(){
        System.out.println("300/-");
    }
}
