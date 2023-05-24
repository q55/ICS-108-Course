package lab15.Version3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TimeFormatException {
        boolean again = true;
        Scanner input = new Scanner(System.in);
        String time;
        while (again){
            System.out.println("Enter time in 24-hour notation:");
            time = input.next();
            Check myTime = new Check(time);
            try {
                myTime.checkTime();
            }catch (TimeFormatException ex){
                System.out.println(ex.getMessage() + time);
            }
            System.out.println("Again? (y/n)");
            String ans = input.next();
            if(! (Objects.equals(ans, "y"))){
                again = false;
            }
        }
        System.out.println("End of program");
    }

}
