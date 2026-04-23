package Inheritance.Interface;
// Since the parents are interfaces, you could implement two or more at once
public class Fish implements Prey, Predator{

    // Now fish, it can be considered, as prey, and predators
    // So it must have two parents(Interface)

    @Override
    public void flee() {
        System.out.println("The fish flee from a fish twice its size.");
    }

    @Override
    public void hunt(){
        System.out.println("The fish hunts a fish smaller than him.");
    }

}
