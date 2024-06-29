package day30_b_custom_classes;



public class Coffee {
    double price;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return "Coffee:" +
                "\n\tprice: $" + price +
                "\n\tsize: " + size +
                "\n\tbrand: " + brand +
                "\n\type: " + type;
    }

    public void drink () {
        System.out.println("Drinking " + type + " of coffee.");
    }


    public void refill (double num) {
        System.out.println("Refilling " + num + " oz");
        size += num;
    }


}