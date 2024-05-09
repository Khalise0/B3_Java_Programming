package day22_arrays_methods;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        String [] words1 = {"a", "b", "c"};
        int [] words3 = {1, 1, 2, 3, 4};

        System.out.println(String.join("<>",words));
        System.out.println(String.join("---------",words));
        String fromArr = String.join(" ",words);
        System.out.println(fromArr);
        System.out.println(Arrays.toString(words1));


    }
}
