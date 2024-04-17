package day09_a_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your annual salary : ");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work in the week: ");
        int hours = input.nextInt();

        double hourly = salary/(hours* 54);
        System.out.println("With the annual salary of " + salary+ " and working for "+hours+" hours in the week your hourly rate is "+hourly);
    }
}
