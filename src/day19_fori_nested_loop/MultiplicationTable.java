package day19_fori_nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 1; i <= 10 ; i++) {

            for (int j = 1; j <= 10; j++) {
                result = i*j;
                System.out.println( i+ " * " + j + " = "+ result );
            }
            System.out.println("");
        }
    }
}
