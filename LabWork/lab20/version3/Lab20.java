package lab20.version3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab20 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your elements: ");
        String[] elemnts = input.nextLine().split(" ");
        for (String elemnt : elemnts) {
            myList.add(Integer.parseInt(elemnt));
        }
        System.out.println(largestNum(myList,0));
    }

    public static int largestNum(ArrayList<Integer> list,int currentNum) {
        if (list.size() == 0) {
            return currentNum;
        } else {

            if (currentNum < list.get(0)) {
                currentNum = list.get(0);
            }
            list.remove(0);
            return largestNum(list,currentNum);
        }
    }}