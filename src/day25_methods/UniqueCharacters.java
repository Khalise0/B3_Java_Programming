package day25_methods;
/*
    Unique Characters

    create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

    Hint: use your frequency method to do some of the work

    Ex:
    Input:
        aaaaabcccdeeff

    Output:
        bd
 */

import my_utilities.StringUtil;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "";

        System.out.println(uniqueCharacters("apple"));;

        System.out.println(StringUtil.uniqueCharacters("loopCamp"));


    }

    public static String uniqueCharacters(String str){

        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);


            if(StringUtil.frequencyOfCharacters(str,eachLetter) == 1){
                unique += eachLetter + "";
            }

        }

        return unique;
    }

}
