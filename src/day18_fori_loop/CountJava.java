package day18_fori_loop;

public class CountJava {
    public static void main(String[] args) {

        String str = "Java is a java language java";
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {

            String everyFore = str.substring(i,i+4);

            if(everyFore.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println("In sentence " + count + " java");
    }
}
