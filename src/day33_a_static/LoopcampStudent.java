package day33_a_static;

import java.util.Arrays;

public class LoopcampStudent {

    String name;
    int groupNumber;

    static int batchNumber;

static String [] teachers;
static String schoolName;


//Static Block runs only one time
static{
    batchNumber =3;
    teachers = new String[]{"Nadir", "Feyruz", "James","Diana"};
    schoolName = "Loopcamp";
    printInfo();
}


public static void printInfo(){
    System.out.println("School name: " + schoolName);
    System.out.println("Batch number: " + batchNumber);
    System.out.println("Teachers: " + Arrays.toString(teachers));

}
public LoopcampStudent(String name, int groupNumber){

    this.name = name;
    this.groupNumber = groupNumber;
}

    @Override
    public String toString() {
        return "Loopcamp Student info: " +
                "\n\tname: " + name  +
                "\n\tgroup number: " + groupNumber;
    }
}