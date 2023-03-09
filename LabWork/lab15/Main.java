package lab15;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("Enter time in 24-hour notation:");
            String time = input.next();
            try {
                check obj= new check(time);
            }catch (TimeFormatException e){
                System.out.println(e.getMessage()+time);
            }

            System.out.println("Again? (y/n)");
            String answer = input.next();
            if (Objects.equals(answer, "n")){
                flag = false;
                System.out.println("End of program");
            }
        }
    }
}
