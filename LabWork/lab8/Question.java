package lab8;

public class Question {
    private String text;

    Question(){
        this("Variables that are shared by every instance of a class are:");

    }
    Question(String text){
        this.text = text;
    }

    public String toString(){
        return super.toString() + this.text;
    }
}
