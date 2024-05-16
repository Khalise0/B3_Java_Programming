package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {

    public static void main(String[] args) {

        int [] arr = {12, 34, 67, 89, 43, 41};

        System.out.println(minNumInArr(arr));

        System.out.println(minNumInArr(arr));

        System.out.println(ArrayUtil.minNumInArr(arr));


        System.out.println(ArrayUtil.maxNumInSortedArr(arr));
        System.out.println(ArrayUtil.maxNumInArr(arr));
    }




    public static int minNumInArr (int [] arr){

        int min = arr [0];

        for (int eachNum: arr) {

            if(eachNum< min){

                min = eachNum;
            }

        }
        return min;

    }



}
