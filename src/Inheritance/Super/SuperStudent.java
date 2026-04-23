package Inheritance.Super;
public class SuperStudent extends SuperPerson {
    
    // Since this class inherits from the SuperPerson class, This class already has the first and last attributes and the introduce method.

    int grade;

    SuperStudent(String first, String last, int grade) {
        
        // Instead of using the this keyword to initialize the first and last attributes, we can use the super keyword to call the constructor of the SuperPerson class to initialize the attributes.
        // Its like sending information to the parent class to initialize the attributes that the parent class needs
        // Super just refers to the parent. Whatever the parent class needs, we can send it using the super keyword. In this case, the parent class needs the first and last attributes, so we send them using the super keyword.
        super(first, last);
        this.grade = grade;

    }

    void grade() {
        System.out.println("My grade is " + this.grade);
    }

}
