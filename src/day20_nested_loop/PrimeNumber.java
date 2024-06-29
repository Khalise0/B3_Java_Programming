package day20_nested_loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num2 = input.nextInt();



        for (int i = 1; i <= num2; i++) {
            int count = 0;

            for (int j = 1; j <= i; i++) {
                if (num2 % j == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(i + ", ");
            }
        }
    }
}
