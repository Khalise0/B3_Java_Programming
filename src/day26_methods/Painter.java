package day26_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();

        Picture.draw("pink");

        Picture.draw("pink", "blue");

        Picture.draw("blue", 5);

        Picture.draw(2);

    }
}
