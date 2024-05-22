package day27_wrapper_array_list;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "jh8*&334jl3dRE";
        int upper = 0 ;
        int lower = 0 ;
        int digit = 0 ;
        int other = 0 ;


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(Character.isUpperCase(each)){
                upper++;
            }else if(Character.isLowerCase(each)){
                lower++;
            } else if(Character.isDigit(each)){
                digit++;
            }else{
                other++;
            }
        }
        System.out.println("Uppercase letter count: " + upper);
        System.out.println("Lowercase letter count: " + lower);
        System.out.println("Digits count: " + digit);
        System.out.println("Other count: " + other);

        System.out.println(Integer.MAX_VALUE); // These are not method. These arr CONSTANTS which we will learn later.
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


    }
}
