package com.durga.day28_Enum.EnumClass;


/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class EnumConstructorExample {
    public static void main(String[] args) {
        Color myColor = Color.RED;
        System.out.println("My color is RGB(" +
                myColor.getRed() + ", " +
                myColor.getGreen() + ", " +
                myColor.getBlue() + ")");
    }
}

enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private int red;
    private int green;
    private int blue;

    // Constructor for Color enum
    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getter methods to access RGB values
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
