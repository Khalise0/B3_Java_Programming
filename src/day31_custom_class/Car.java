package day31_custom_class;
public class Car {

    // model, year, color, fuel level (percent number)
    String model;
    int year;
    String color;
    double fuelLevel;



    public String toString() {
        return  "Model: " + model
                + "\nYear: " + year
                + "\nColor: " + color
                + "\nFuel Level: " + fuelLevel;
    }


    public void drive () {
        System.out.println("Driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank () {
        System.out.println("Filling tank.");
        fuelLevel = 100;
    }


    public boolean isLow(){
        return fuelLevel < 25;
    }


}

//class Runner {
//    public static void main(String[] args) {
//        Car obj = new Car();
//    }
//}

