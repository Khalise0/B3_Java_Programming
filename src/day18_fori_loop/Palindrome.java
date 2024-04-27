package day18_fori_loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (reversed.equalsIgnoreCase(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}
