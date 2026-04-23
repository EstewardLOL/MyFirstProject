package Inheritance.Abstraction;
public class Abstraction {
    public static void main(String[] args) {
        
        // Abstraction = I don't need to know how it works, I just need it to work.
        //               Hiding the messy, complicated guts and only showing the important buttons.

        // It's like a "Need to Know" basis for your code. The user of your class only needs to know which buttons to press, not how the wires are crossed inside.

        // You can't create a shape object because the class is abstract
        // Shape shape1 = new Shape();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        circle.fill(); // inherited from Shape class
        triangle.fill(); // inherited from Shape class
        rectangle.fill(); // inherited from Shape class

        circle.draw(); // implemented from Shape by Circle class
        triangle.draw(); // implemented from Shape by Triangle class
        rectangle.draw(); // implemented from Shape by Rectangle class

    }
}
