package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.type ="German shepard";
        dog1.walk();

        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();
    }
}
