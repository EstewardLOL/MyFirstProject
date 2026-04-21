package Inheritance;
public class MethodOveridding {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // Method Overriding = I know my parent taught me how to do this, but I have a better/different way of doing it.
        //                     I want to use my way instead of the way my parent taught me.

        OverrideCat cat = new OverrideCat();
        OverrideFish fish = new OverrideFish();

        cat.move();

        // A fish doesnt move the same way a dog or cat does, so we want to override the move method for fish
        fish.move();

    }
}
