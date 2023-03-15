package lab11;

public class Graduate extends Student{
    private String researchArea;

    public Graduate(int ID,String name,double GPA,String phoneNum,String researchArea){
        super(ID,name,GPA,phoneNum);
        this.researchArea =researchArea;
    }

    public String toString(){
        return super.toString()+ ", researchArea "+ researchArea;
    }
}
