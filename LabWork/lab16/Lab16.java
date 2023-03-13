package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lab16 {
        public static void main(String[] args){
            ArrayList<Integer> number =new ArrayList<>();
            File unSortedText = new File("unsortedStudents.txt");
            System.out.println(unSortedText.exists());
            try (Scanner in = new Scanner(unSortedText)){
                while (in.hasNextInt()){
                    int n = in.nextInt();
                    number.add(n);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Collections.sort(number);


            File SortedText = new File("sortedStudents.txt");
            try{
                PrintWriter out = new PrintWriter(SortedText);
                for (Integer num:number){
                    out.println(num);
                }
                out.close();
            }catch (FileNotFoundException e){
                System.out.println("File does not exist");
            }
            System.out.println(SortedText.exists());
        }
}
