public class VarArgs {

    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           makes method more flexible, no need for overloaded methods
        //           java will pack arguments into an array
        //           ... (ellipsis)

        System.out.println(add(1, 2, 3, 4));

    } // Sending an Integer, ... will pack all arguments that we sent into an array!
    static int add(int... num) {

        int total = 0;

        for(int nums : num) {
            total += nums;
        }
        return total;
    }
}
