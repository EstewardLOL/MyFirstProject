public class variables {

    static int x = 3; // CLASS, outside all methods; in the street

    public static void main(String[] args) { //Magic word to run the code!
        /*
    Primitive = Give 10$
    Reference = IOU 10$

    STEPS IN CREATING A VARIABLE
        1. Declaration
        2. Assignment

    TYPES OF VARIABLES
    INT = WHOLE NUMBER ; int age = 10;
    BOOLEAN = TRUE/FASE ; boolean isMinor;
    DOUBLE = DECIMALS ; double math;
    STRING = WORDS ; string name = "";
    CHAR = SINGLE CHARACTERS, SYMBOLS ;  char dollar = '$';
     */

        // VARIABLE SCOPE - where a var can be accessed
        // LOCAL - var declared inside a method = local; inside their houses
        // CLASS - all methods can see the variable; it's like in the street

        doSomething();
    }

    static void doSomething(){
        // we are calling the class variable = 3
        System.out.println(x);
    }
}