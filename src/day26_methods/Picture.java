package day26_methods;

public class Picture {

    public static void draw(){

        System.out.println("Trying to draw");

    }

    public static void draw(String color){
        System.out.println("Trying to draw with " + color);
    }


    public static void draw(String color1, String color2){
        System.out.println("Trying to draw with " + color1 + " " + color2);
    }

    public static void draw(String color1, int num){
        System.out.println("Trying to draw with " + color1 + " " + num);
    }

    public static void draw(int num){
        System.out.println("Trying to draw with " + num);
    }

}
