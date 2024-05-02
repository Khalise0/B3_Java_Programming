package day19_fori_nested_loop;

public class Month {
    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <=7 ; j++) {
                System.out.println("\tDay: " + j);
            }
        }
    }
}
