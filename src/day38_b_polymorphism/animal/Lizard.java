package day38_b_polymorphism.animal;

public class Lizard extends Animal {

    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD is eating");
    }
}