package day31_custom_class;

public class Marker {
    String type;          // Instance var
    String brand;
    String color;


    public Marker( String inputType, String inputBrand, String inputColor){


        type = inputType;
        brand = inputBrand;
        color = inputColor;

    }

    @Override
    public String toString() {
        return "Marker:" +
                "\n type: " + type +
                "\n brand: " + brand +
                "\n color: " + color;
    }
}
