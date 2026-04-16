package FlowControl;

public class nestedIf {
    public static void main(String[] args)  {

        // Nested If Statements
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) { // if isStudent = true
            if(isSenior) { // ifSenior && isStudent = true
                System.out.println("You get a senior and student discount of 30%");
                price *= 0.7;
            } else { // isStudent = tre
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if(isSenior) { //if isStudent = false
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }

        System.out.printf("Your total price is $%.2f", price);

    }
}
