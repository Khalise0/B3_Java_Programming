package day20_nested_loop;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "AABCCJJKKK%&(@";
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {

            char eachLetter1 = str.charAt(i);


            for (int j = 0; j < str.length(); j++) {
                count = 0;
                char eachLetter2 = str.charAt(j);

                if (eachLetter1 == eachLetter2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachLetter1);
            }
            //count = 0;
        }
    }
}
