package day17_loops;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int originalN = n;
        int result = 1;
        while(n>1) {
            result = result * n;
            n--;
        }
        System.out.println("Factorial of " + originalN + " is " + result);
    }
}
