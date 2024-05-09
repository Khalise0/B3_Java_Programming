package day22_arrays_methods;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b); // It's not correct to compare this way
                                    // This compares two different objects

        System.out.println(Arrays.equals(a,b));


    }
}
