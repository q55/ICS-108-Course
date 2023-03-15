package lab8.Version2;

import java.util.Arrays;

public class MCQuestion extends Question {
    String answer;
    String[] choices;

    public MCQuestion(String text , String[] choices , String answer){
        super(text);
        this.choices = choices;
        this.answer = answer;

    }
    @Override
    public String toString(){
        return "Question:" + "\n"+ super.toString()+ Arrays.toString(choices) + "\n"+"answer: "+answer;
    }

}