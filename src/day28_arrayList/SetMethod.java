package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
        public static void main(String[] args) {

            ArrayList <Integer> nums = new ArrayList<>();
            nums.add(100);
            nums.add(200);
            nums.add(250);
            nums.add(1);
            nums.add(400);
            nums.add(500);
            nums.add(1);
            nums.add(600);
            nums.add(700);
            System.out.println(nums);

            nums.set(0, -100 );
            System.out.println(nums);

            nums.set(nums.size()-1, 900);
            System.out.println(nums);


            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("SoftSkills");
            list.add("api");
            System.out.println(list);
            list.set(1,"Jira Xray");
            System.out.println(list);
            list.set(list.indexOf("api"),"Selenium");
            System.out.println(list);
    }
}
