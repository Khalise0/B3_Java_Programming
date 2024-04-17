package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCardBalance = 200.0;
        double item1Price = 100.0;
        double item2Price = 40.0;

        System.out.println("I have $ " + giftCardBalance + " balance. ");
        System.out.println( "Buy item 1 for $ " + item1Price + " with your gift card. ");

        //giftCardBalance = giftCardBalance - item1Price;
        giftCardBalance -= item1Price;
        System.out.println( " After purchasing item 1 my gift card balance is $ " + giftCardBalance );

        giftCardBalance -=item2Price;
        System.out.println( " After purchasing item 2 my gift card balance is $ " + giftCardBalance );

    }
}
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */