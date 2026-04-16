package Methods;

public class methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called using ()
        /*
        Methods.methods cant determine Basics.variables in other Methods.methods! eg., Putting string name = "e"; and calling it in another method.
        main = is your house | methodName = is your neighbor ; you cant see eachother!
        1. static to static calls only!
         */

        int age = 21; // declare/assign age

        if (isMinor(age)) { // checks the return value of isMinor with our given age
            System.out.println("You are a adult!");
        } else {
            System.out.println("You are a minor!");
        }


    }

    static boolean isMinor(int age) {
        return age >= 18; // return true if >=18, false if s17<
    }
}
