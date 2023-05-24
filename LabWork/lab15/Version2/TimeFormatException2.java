package lab15.Version2;

public class TimeFormatException2 extends Exception {

    public TimeFormatException2(){
        super("Invalid time");
    }

    public TimeFormatException2(int hours,int minute){
        super("There is no such time as "+ hours+":"+minute);
    }
}
