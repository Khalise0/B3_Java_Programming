package day18_fori_loop;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = input.nextLine().trim();
        int count = 1;

        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i) == ' '){
                count ++;
            }
        }
        System.out.println("There is " + count + " words.");
    }
}
