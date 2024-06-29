package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        //System.out.println(months.length);

        //System.out.println(months[0]);
        //System.out.println(months[months.length-1]);
        int num;
        do {

            System.out.print("Enter: ");
            num = key.nextInt();

            if (num >= 1 && num <= 12) {
                System.out.println("The number you entered is: " + months[num-1]);
            } else {
                System.out.println("Wrong Input. There is no month for that number: " + num + " Try again!");
            }


        } while (num < 1 || num > 12);
    }
}
