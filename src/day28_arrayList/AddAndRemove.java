package day28_arrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);

        list.remove(0);
        System.out.println(list.remove(0));
        System.out.println(list);

        boolean b = list.remove("Keyboard");
        System.out.println(list);
        System.out.println(list.remove("Keyboard"));
        System.out.println(list);
        System.out.println(list.remove("Mouse"));
        System.out.println(list);



    }
}
