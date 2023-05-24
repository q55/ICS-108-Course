package lab15.Version2;

import java.util.Scanner;


public class main {
    public static void main(String[] args){

        String time;
        String aggrement;
        boolean valide = true;;
        Scanner input = new Scanner(System.in);

        while (valide){
            System.out.println("Enter time in 24-hour notation:");
            time = input.next();
            try {
                new Check(time);
            }
            catch (TimeFormatException2 ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Again? (y/n)");
            aggrement = input.next();
            if (aggrement.equals("n")){
                valide = false;
                System.out.println("End of program");

            }
        }

    }
}
