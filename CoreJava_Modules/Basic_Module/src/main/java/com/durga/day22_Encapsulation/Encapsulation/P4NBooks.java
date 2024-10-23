package com.durga.day22_Encapsulation.Encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class P4NBooks {
    public static void main(String[] args) {

        DBook db = new DBook(450, 12, "codeswithpankaj");

        System.out.println("Book Name : "+db.getBookName());
        int total_price =  db.getPrice()*db.getQt();
        System.out.println("Total Price Name : "+total_price);

        db.setPrice(750);
        db.setQt(56);
        System.out.println("New price : - "+db.getPrice());
        int total_price1 =  db.getPrice()*db.getQt();
        System.out.println("Total Price Name : "+total_price1);


    }
}

@Getter
@Setter
@AllArgsConstructor
class DBook{
    int price;
    int qt;
    String bookName;
}
