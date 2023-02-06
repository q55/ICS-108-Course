import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int courses ,i ,totall=0;
        double hours=0,gpa;
        String grade,info,lastChar,firstChar;
        char myChar;
        System.out.println("How many courses?");
        Scanner input = new Scanner(System.in);
        courses = input.nextInt();
        System.out.println();
        System.out.println("Enter letter grade, credit hours for "+courses+" courses:");


        for(i=1;i<=courses;i++){
            Scanner input2 = new Scanner(System.in);
            info = input2.nextLine();
            lastChar=info.substring(info.length() - 1);
            int x = Integer.parseInt(lastChar);
            totall += x;
            firstChar =info.substring(0,2);
            if(firstChar.equals("A+"))
                hours += 4*x ;
            if(firstChar.equals("A "))
                hours += 3.75*x;
            if(firstChar.equals("B+"))
                hours += 3.5*x;
            if(firstChar.equals("B "))
                hours += 3.0*x;
            if(firstChar.equals("C+"))
                hours += 2.5*x;
            if(firstChar.equals("C "))
                hours += 2*x;
            if(firstChar.equals("D+"))
                hours += 1.5*x;
            if(firstChar.equals("D "))
                hours += 1.0*x;
            if(firstChar.equals("F "))
                hours += 0.0*x;

        }
        gpa = hours/totall;
        System.out.println("GPA ="+gpa);

    }
}
