package Methods;

public class VarArgs {

    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           makes method more flexible, no need for overloaded Methods.methods
        //           java will pack arguments into an DataStructures.array
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 4));

    } // Sending an Integer, ... will pack all arguments that we sent into an DataStructures.array!
    static int add(int... num) {

        int total = 0;

        for(int nums : num) {
            total += nums;
        }
        return total;
    }
}
