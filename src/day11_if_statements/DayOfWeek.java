package day11_if_statements;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number between 1-7: ");
        int weekDay = key.nextInt();

        if(weekDay==1){
            System.out.println("Monday");
        }
        else if(weekDay==2){
            System.out.println("Tuesday");
        }
        else if(weekDay==3){
            System.out.println("Wednesday");
        }
        else if(weekDay==4){
            System.out.println("Thursday");
        }
        else if(weekDay==5){
            System.out.println("Friday");
        }
        else if(weekDay==6){
            System.out.println("Saturday");
        }
        else if(weekDay==6){
            System.out.println("Sunday");
        } else{
            System.out.println("Wrong number ");
        }
    }
}
