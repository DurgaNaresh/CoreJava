package com.durga.day20_Interfaces;


/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Drawable circle = new Circle1(5);
        Drawable rectangle = new Rectangle(8, 6);

        // Polymorphic method invocation
        circle.draw();     // Calls draw() in Circle class
        rectangle.draw();  // Calls draw() in Rectangle class
    }
}

// Define an interface named 'Drawable'
interface Drawable {
    void draw(); // Abstract method
}

// Implement the 'Drawable' interface in a class 'Circle'
class Circle1 implements Drawable {
    private int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Implement the 'Drawable' interface in a class 'Rectangle'
class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
