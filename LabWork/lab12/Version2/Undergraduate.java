package lab12.Version2;

public class Undergraduate extends Student{
    private double GPA;

    public Undergraduate(String id, double GPA){
        super(id,GPA );
        this.GPA = GPA;
    }

    @Override
    public String getStatus() {
        if(GPA >= 3){
            return "honor";
        }
        else if(GPA >= 2){
            return "good";
        }
        return "probation";
    }
}
