package DataStructures;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Watermelon", "Orange"};
        String[] meat = {"Pork", "Beef", "Fish"};
        String[] vegetables = {"Lettuce", "Tomato", "Carrot"};


        // This is an 2D Array's; It's an DataStructures.array made up of arrays
        String[][] groceries = {fruits, meat, vegetables};

        groceries[0][0] = "Pineapple"; // Replace row 0 and column 0 with Pineapple

        System.out.println(groceries);

        for(String[] foods : groceries) { // "Which group am I looking at?"
            for(String food : foods) { // "Which item inside that group am I looking at?"
                System.out.println(food + " ");
            } // Next Group
            System.out.println();
        }
    }
}
