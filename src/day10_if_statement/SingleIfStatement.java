package day10_if_statement;

import java.sql.SQLOutput;

public class SingleIfStatement {
    public static void main(String [] args){
        if (false){
            System.out.println("Hello world!");
        }
        System.out.println("Second print statement");
        if(true){
            System.out.println("Today is Wednesday!");
        }

        int score = 60;
        if( score>=75){
            System.out.println("Passing exam!");
        }
        if(score<75){
            System.out.println("Failing the exam");
        }

        int year = 2021;
        boolean lockdown = year ==2020 || year ==2021;

        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Practice coding");
        }
    }
}
