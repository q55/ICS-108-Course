package lab1.Version2;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("How many courses?");
        int numOfLoops = input.nextInt();
        double hours = 0,counted=0;
        System.out.println("Enter letter grade, credit hours for 3 courses");

        for (int i=0; i < numOfLoops;i++){
            String grade = input.next();
            int hour = input.nextInt();
            hours += hour;
            if ("A+".equals(grade) ){
                counted += hour *4;;
            }
            else if ("A".equals(grade) ){
                counted += hour *3.75;
            } else if ("B".equals(grade) ){
                counted += hour *3;
            }
        }
        System.out.println("Gpa" +counted/hours);

    }

}
