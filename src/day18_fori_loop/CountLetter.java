package day18_fori_loop;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String word = input.nextLine();
        System.out.println("Give character: ");
        String letter = input.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char eachCharOnEachCycle = word.charAt(i);
            String charEach = "" +eachCharOnEachCycle;
            if(charEach.equalsIgnoreCase(letter)){
                count++;
            }
        }
        System.out.println(count);

    }
}
