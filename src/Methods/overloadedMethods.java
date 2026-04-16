package Methods;

public class overloadedMethods {
    public static void main(String[] args) {

        // Overloaded Methods.methods = same name, different: parameters.
        //                      uniquemethodsignature = methodname + parameters

        System.out.println(add(1, 2,3 ));

    }


    static double add(double a, double b){ // Same name but: Different parameters
        return a + b;
    }
    static double add(double a, double b, double c){ // Same name but: Different parameters
        return a + b + c;
    }


}
