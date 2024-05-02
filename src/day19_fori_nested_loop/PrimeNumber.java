package day19_fori_nested_loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result++;
            }
        }

        if (result == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
