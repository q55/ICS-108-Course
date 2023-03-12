package lab7.Version2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab7 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int numberObj = input.nextInt();
        System.out.print("Enter the weights of the objects: ");
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i=0;i<numberObj;i++) {
           myList.add(input.nextInt());
        }
        int listNum = 0;
        boolean valid=true;
        while (valid){
            Container myContainer = new Container(10);
            for (Integer num:myList){
                myContainer.addItem(num);
            }
            for (Integer num:myContainer.getContainerList()){
                myList.remove(num);
            }
            System.out.println("Container "+listNum+" contains objects with weights"+ myContainer.getContainerList());
            listNum ++;
            if (myList.size()==0){
                valid = false;
            }
        }

    }
}
