package day18_fori_loop;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String sentence = input.nextLine();
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);
            if( symbol >='A' && symbol<= 'Z'){
                upperCount++;
            } else if( symbol >=97 && symbol<= 122){
                lowerCount++;
            } else if( symbol >=48 && symbol<= 57){
                numCount++;
            }
        }
        System.out.println("There are " + upperCount + " uppercase letters");
        System.out.println("There are " + lowerCount + " lowercase letters");
        System.out.println("There are " + upperCount + " numbers");
    }
}
