public class arithmeticOperators {
    public static void main(String[] args) {

        // Arithmetic Operators: - / * % +

        // Augmented Assignment Operators: +=, *=, -=, /=, %=

        // Increment(x++; = 2) and Decrement(x--1; = 0) Operators

        // Order of Operations [PEMDAS]

        int a = 1; // AAO
        int b = 2;
        a += b;

        int x = 0; // Increment
        int z = 0; // Decrement
        x++;
        z--;

        double pemdas = 3 + 4  * (7 - 5) / 2.0; // PEMDAS

        System.out.println(pemdas);
        System.out.println(x);
        System.out.println(z);
        System.out.println(a);
    }
}
