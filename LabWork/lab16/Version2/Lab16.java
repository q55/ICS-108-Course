package lab16.Version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) throws FileNotFoundException {

        File unSorted = new File("unsortedStudents.txt");
        File sorted = new File("sortedStudents.txt");

        ArrayList<Integer> myList = new ArrayList<>();

        Scanner input = new Scanner(unSorted);
        PrintWriter output = new PrintWriter(sorted);

        while(input.hasNext()){
            myList.add(input.nextInt());
        }
        Collections.sort(myList);
        for(int num:myList){
            System.out.println(num);
            output.println(num);
        }
        output.close();
    }
}