package lab11;

public class Undergraduate extends Student {
    private String level;

    public Undergraduate(int ID,String name,double GPA,String phoneNum,String level){
        super(ID,name,GPA,phoneNum);
        this.level =level;
    }

    public String toString(){
        return super.toString()+ ", level "+ level;
    }

}
