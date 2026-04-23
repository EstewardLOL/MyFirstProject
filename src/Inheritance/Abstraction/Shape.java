package Inheritance.Abstraction;

// You can't create any shape objects because the class is abstract
public abstract class Shape {

    // This isn't automatically implemented by its children; Also it doesn't have a body.
    abstract void draw(); // abstract method (doesn't have a body), and is not automatically inherited by all subclasses of Shape, but must be implemented by all subclasses of Shape


    void fill() { // concrete method (has a body) and is automatically inherited by all subclasses of Shape 
        System.out.println("Filling the shape");
    }

}
