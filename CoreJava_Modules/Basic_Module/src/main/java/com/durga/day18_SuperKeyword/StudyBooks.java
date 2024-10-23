package com.durga.day18_SuperKeyword;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class StudyBooks {
    public static void main(String[] args) {
        TopicJava tj = new TopicJava();
        tj.getinfo();
    }
}

class JavaBook{

    void getinfo(){
        System.out.println("Book name is CWP - JAVA developments");
    }

}

class TopicJava extends JavaBook{
    void getinfo(){
        super.getinfo();
        System.out.println("Topic 1 - Intro");
        System.out.println("Topic 2 - Variable");
        System.out.println("Topic 3 - Operators");
    }
}
