package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String>listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("Bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>(listOne);
        System.out.println(listTwo);
        listTwo.add("Hola");

        System.out.println();
        System.out.println(listOne);
        System.out.println(listTwo);


        ArrayList <String> list3 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(list3);

        //ArrayList <String> listFour = new ArrayList<>("One", "Two", "Three");  // THIS IS NOT VALID



    }
}
