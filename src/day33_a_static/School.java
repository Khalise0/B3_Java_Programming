package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {


        LoopcampStudent student1 = new LoopcampStudent("Diliara", 2);
        System.out.println(student1);

        LoopcampStudent student2 = new LoopcampStudent("Aygun", 3);
        System.out.println(student2);
        System.out.println();
        LoopcampStudent.printInfo();

        System.out.println();
        System.out.println("Teachers at LoopCamp: " + Arrays.toString(LoopcampStudent.teachers));

        System.out.println();
        int num = 0;
        for(String eachTeacher : LoopcampStudent.teachers){
            System.out.println("Teacher " + ++num + ": "+ eachTeacher);
        }

    }
}
