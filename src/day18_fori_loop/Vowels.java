package day18_fori_loop;
public class Vowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase characters
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter (a-z)
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
