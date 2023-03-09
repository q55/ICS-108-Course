package lab15;

public class check {
    private String time;
    public check(String time) throws TimeFormatException{
        this.time=time;
        valid();
    }
    public void valid() throws TimeFormatException {
        if ((time.length() == 5) & time.charAt(2) == ':') {
            String hour = time.substring(0, 2);
            String min = time.substring(3, 5);
            int hourInt = 0;
            int minInt = 0;
            try {
                hourInt = Integer.parseInt(hour);
                minInt = Integer.parseInt(min);
            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid integer");
            }
            if (minInt>60){
                throw new TimeFormatException();
            }
            if (hourInt > 12){
                hourInt -= 12;
                System.out.println("That is the same as \n"+hourInt+":"+min+" PM");
            }else {
                System.out.println("That is the same as \n"+hourInt+":"+min+" AM");

            }
            System.out.println();

        }else {
            throw new TimeFormatException();
        }
    }

}
