package day44_map_and_functions.buildin_functions;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = day44_map_and_functions.buildin_functions.UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(day44_map_and_functions.buildin_functions.UsePredicate.isPalindrome.test("apple"));

        System.out.println( day44_map_and_functions.buildin_functions.UsePredicate.isPrime.test(7));
        System.out.println( day44_map_and_functions.buildin_functions.UsePredicate.isPrime.test(8));

    }
}