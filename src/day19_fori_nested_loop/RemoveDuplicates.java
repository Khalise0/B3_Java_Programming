package day19_fori_nested_loop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String original = "aaaabbsde";
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            char eachLetter = original.charAt(i);
            if (!result.contains("" + eachLetter)) {
                result += eachLetter;
            }
        }
        System.out.println(result);
    }
}
