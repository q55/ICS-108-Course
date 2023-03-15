package lab12.Version2;

public class Graduate extends Student{
    private double GPA;

    public Graduate(String id, double GPA){
        super(id,GPA );
        this.GPA = GPA;
    }

    @Override
    public String getStatus() {
        if(GPA >= 3){
            return "good";
        }
        return "probation";
    }
}
