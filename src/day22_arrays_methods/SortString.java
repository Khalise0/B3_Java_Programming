package day22_arrays_methods;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String [] arr = {"java", "Hello", "$Dollar", "Zell", "4six"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
