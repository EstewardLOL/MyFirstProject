package Inheritance.Abstraction;
public class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");     
    }

    @Override
    // Lets say to the parent, "Hey, I know you have a fill() method, but I want to do it my own way, so I'm going to override it and provide my own implementation of the fill() method in the Rectangle class."
    void fill() {
        System.out.println("Filling the rectangle"); 
    }

}
