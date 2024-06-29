package day30_a_arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPair {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,54,23,3,45,6,2,10));

        System.out.println(nums);
        System.out.println(goodPairs(nums));
    }

    public static ArrayList<Integer> goodPairs (ArrayList<Integer> list){

        ArrayList<Integer> goodList = new ArrayList<>(){};
        for (int i = 0; i < list.size(); i+=2) {


        if(list.get(i) <= list.get(i+1)){
            goodList.add(list.get(i));
            goodList.add(list.get(i+1));
        }
    }
    return goodList;
    }
}
