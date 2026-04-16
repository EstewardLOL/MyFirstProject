package OOP;

public class Constructor {
    public static void main(String[] args) {

        // OOP.Constructor - A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        // Giving out unique attribute
        Student student1 = new Student("Estew", 15, 9, "Random");
        Student student2 = new Student(); // This won't work: Generally, You need attributes first but since we have overloaded constructors this is allowed!
        Student student3 = new Student("Estew"); // Calls the appropriate object(our overloaded one with only one parameter)

        student1.study(); // Call method

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.grade);
        System.out.println(student1.idk);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.grade);
        System.out.println(student2.idk);

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.grade);
        System.out.println(student3.idk);


    }
}
