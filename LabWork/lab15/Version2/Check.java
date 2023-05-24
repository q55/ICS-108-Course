package lab15.Version2;

public class Check {
    private String time;

    public Check(String time) throws TimeFormatException2 {
    this.time = time;

    if (time.length() != 5 & time.charAt(3) != ':'){
        throw new TimeFormatException2();
    }
    try {
        int hours = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
    }
    catch (NumberFormatException ex){
        throw new TimeFormatException2();
    }
        int hours = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));

    if (hours>24 || minute >60){
        throw new TimeFormatException2(hours,minute);
    }
    else if (hours<12) {
        System.out.println(hours+":"+time.substring(3,5)+ " AM");
    }
    else {
        hours -= 12;
        System.out.println(hours+":"+time.substring(3,5)+ " PM");
    }

    }
}
