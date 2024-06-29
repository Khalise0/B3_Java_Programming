package day25_methods;

import my_utilities.StringUtil;

/*
    Fix Format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {

    public static void main(String[] args) {

        String str = "MicKy";

        System.out.println(fixFormat(str));

        System.out.println(StringUtil.fixFormat("LoopCAMP"));

    }
    public static String fixFormat (String str){
        String result = "";

         result = str.charAt(0)+"".toUpperCase() + str.substring(1).toLowerCase();

        return result;

    }
}
