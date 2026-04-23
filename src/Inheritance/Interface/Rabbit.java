package Inheritance.Interface;
public class Rabbit implements Prey{

    @Override
    // The method flee of the parent needs to be defined. So the child is saying: "Hey Parent, Thank you for giving this to me, Ill make it better"
    public void flee() {
        System.out.println("*The rabbit ran*");
    }

}
