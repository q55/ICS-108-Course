package lab15.Version3;

import java.util.InputMismatchException;

public class Check {
    private String time;

    Check(String time){
        this.time = time;
    }

    public void checkTime() throws TimeFormatException {
        if((time.length() == 5) && ( time.charAt(2) == ':')){
            try {
                int hour = Integer.parseInt(time.substring(0, 2));
                int min = Integer.parseInt(time.substring(3, 5));
                if (hour >24 || min >60){
                    throw new TimeFormatException();
                }
                if (hour > 12){
                    hour = hour - 12;
                    System.out.println("That is the same as ");
                    System.out.println(hour+ ":" + time.substring(3, 5) + " PM");
                }else {
                    System.out.println("That is the same as ");
                    System.out.println(time + " AM");
                }
            }catch (Exception ex){
                throw new TimeFormatException();
            }
        }
        else throw new TimeFormatException();
    }




}
