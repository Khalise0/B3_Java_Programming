package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        int a = 10;
        a = 11;
        a++;
        ++a;
        a = a + 1;

        a += 10;
        a += 10;
        System.out.println(a);

        int b = 2;
        b *= 6; // b = b * 6; ---->  b = 2 * 6; --- > b = 12
        System.out.println(b); // 12


        int c = 10;
        c %= 3; // c = c % 3; --- >  c = 10 % 3; ---- > c = 1;
        System.out.println(c);
    }
}
