package Inheritance.Super;
public class Super {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // super = Refers to the parent class (Subclass << superclass)
        //         Used in constructors and method overidding
        //         Calls the parent constructor to initialize attributes
        

        // We have to give the attributes to the constructor of the SuperPerson class.
        SuperPerson person1 = new SuperPerson("Bro", "Code");
        // person1.introduce();
        
        
        
        SuperStudent student1 = new SuperStudent("Esteward", "Tabon", 9);

        // Call the introduce method from the SuperPerson class using the student1 object. Since the SuperStudent class inherits from the SuperPerson class, it can use the introduce method.
        student1.introduce();
        student1.grade();
    }
}
