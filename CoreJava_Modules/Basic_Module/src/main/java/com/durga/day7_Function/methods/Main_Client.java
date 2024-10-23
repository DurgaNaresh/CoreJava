package com.durga.day7_Function.methods;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Main_Client {
    public static void main(String[] args) {

        //create object

        // className objectName = new className();

        Client cl = new Client();
        cl.get_info();
        cl.getresult(1200, 18);
        System.out.println(cl.mrp()+900);

        long mrp = cl.tax(465465465435l, 56);

        System.out.println("MRP : ---- "+mrp);
    }
}
