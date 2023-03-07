package lab12;

public class Undergraduate extends Student {

    public Undergraduate(int id, double gpa) {
        super(id, gpa);
    }

    @Override
    public String getStatus() {
        if(getGpa() >= 3){
            return "honor";

        }
        else if (getGpa() >= 2 ) {
            return "good";

        }
        else{
                return "probation";
            }
        }
    }

