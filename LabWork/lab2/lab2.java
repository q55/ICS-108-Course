package lab2;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){
        System.out.println("How many letter grades?");
        Scanner input = new Scanner(System.in);
        int numOfLoop = input.nextInt();
        printNRandomLetterGrades(numOfLoop);
    }

    public static void printNRandomLetterGrades(int n){
        String[] array={"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
        for(int i = 1;i<=n;i++){
            int num = (int) (Math.random()*10);
            System.out.println(array[num]);
        }
    }
}