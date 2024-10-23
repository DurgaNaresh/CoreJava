package com.durga.day8_BreakContinue;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class LoopUsingBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            if(i < 5){
                System.out.println("Done ... "+i);
                continue;
            }else{
                System.out.println("************ "+i);
            }
        }
    }
}
