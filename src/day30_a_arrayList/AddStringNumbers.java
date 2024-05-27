package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {





    public static  ArrayList<Integer>sumFromString(ArrayList<String> numToSum){


        ArrayList<Integer>sum = new ArrayList<>();

        for (String each: numToSum){
            int sumOfEach = 0;

            for(String eachLetter: each.split("")){

                sumOfEach += Integer.parseInt(eachLetter);
            }
            sum.add(sumOfEach);
        }


        return sum;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","345","678"));

        System.out.println(sumFromString(list));
    }
}
