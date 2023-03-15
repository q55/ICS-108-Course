package lab8.Version2;

public class Lab8 {
    public static void main(String[] args) {
     String text = "Variables that are shared by every instance of a class are:";
     String answer = "d";
     String[] choices = {"\na. public variables\n" + "b. private variables\n"+ "c. instance variables\n"+ "d. class variables"};
     MCQuestion myObj = new MCQuestion(text,choices,answer);
     System.out.println(myObj);
    }
}
