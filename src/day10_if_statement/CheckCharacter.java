package day10_if_statement;
/*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */
public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'Z';
        if(letter >= 'a' && letter <= 'z' ){
            System.out.println("Uppercase");
        }
        else if (letter >= 'A' && letter <= 'Z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
