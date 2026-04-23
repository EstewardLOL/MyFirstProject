package Inheritance.Abstraction;
public class Circle extends Shape {

    // Since Circle is a subclass of Shape, it must implement the abstract method draw()
    // But since the draw() method is abstract in the Shape class, we must use the @Override annotation to indicate that we are providing its own body (implementation) in the Circle class.



    @Override
    void draw() {
        System.out.println("Drawing a circle");     
    }

    @Override 
    // Lets say to the parent, "Hey, I know you have a fill() method, but I want to do it my own way, so I'm going to override it and provide my own implementation of the fill() method in the Circle class."
    void fill() {
        System.out.println("Filling the circle"); 
    }

}
