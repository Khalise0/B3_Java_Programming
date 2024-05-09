package day22_arrays_methods;

import java.util.Arrays;

public class SortInt {
    public static void main(String[] args) {
        int [] nums = {2, 25, 56, 2, 45, -12};
        int [] num = nums;
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(nums);
        System.out.println(num);
    }
}
