package Inheritance.Override;
public class OverrideFish extends OverrideAnimal{

    // Child of OverrideAnimal, so it inherits all of OverrideAnimal's everything


    // Now we're saying that "Hey Parent! Use mine instead it's better and appropriate!"
    @Override
    void move(){
        System.out.println("The fish swims");
    }

}
