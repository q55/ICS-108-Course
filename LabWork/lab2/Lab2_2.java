package lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args){
        System.out.println("How many letter grades?");
        Scanner input = new Scanner(System.in);
        int numOfLoop = input.nextInt();
        printNRandomLetterGrades(numOfLoop);
    }

    public static void printNRandomLetterGrades(int n){
        for(int i = 1;i<=n;i++){
            int num = (int) (Math.random()*10);
            switch (num){
                case 0 ->  System.out.println("A+");
                case 1 ->  System.out.println("A");
                case 2 ->  System.out.println("B+");
                case 3 ->  System.out.println("B");
                case 4 ->  System.out.println("C+");
                case 5 ->  System.out.println("C");
                case 6 ->  System.out.println("D+");
                case 7 ->  System.out.println("D");
                case 8 ->  System.out.println("F");
            }

        }
    }
}
