package day18_fori_loop;

import java.util.Scanner;

public class Syllables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str = input.nextLine();
        int countDash = 1;
        for (int i = 0; i < str.length(); i++) {
           if( str.charAt(i) == '-'){
               countDash++;
           }
        }
        System.out.println("In your sentence " + countDash + " syllables");
    }
}
