public class Student {

    // Attributes of a Student
    // CONSTRUCTOR LESSON!

    String name;
    int age;
    int grade;
    String idk;


    // Called when Student() |  Constructor
    Student(String name, int age, int grade, String idk){
        this.name = name; // this refers to the object we're working with/constructing (eg. student1)
        this.age = age;
        this.grade = grade;
        this.idk = idk;
    }

    // Example of an Overloaded Constructor: Same name, different parameters
    Student(){ // If attributes are given, default to these values.
        this.name = "Guest";
        this.age = 0;
        this.grade = 0;
        this.idk = "No details provided, defaulting to guest";
    }

    Student(String name){ // Some attributes are defaulted because they are not provided!
        this.name = name;
        this.age = 0; // Set Default because not provided
        this.grade = 0;
        this.idk = "Not Provided!";
    }

    void study(){
        // "this" the object we are currently working with"
        System.out.println(this.name + " is studying!");  // e.g. student1.name is studying
    }

}
