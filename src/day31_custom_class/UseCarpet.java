package day31_custom_class;

public class UseCarpet {
    public static void main(String[] args) {

      //  Car car1 = new Car(); we are calling obj from Car class
        Carpet carpet1 = new Carpet(true, 8.5, 12, 2.5);

        System.out.println(carpet1);

        carpet1.length  = 14;
        // We had to call teh .calculatePrice() method again because that method was called in constructor. Since, we have updated the length, I am calling .calculateMethod() to get updated totalPrice.
        carpet1.calculatePrice();

        System.out.println();
        System.out.println(carpet1);

    }
}
