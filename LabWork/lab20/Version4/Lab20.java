package lab20.Version4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab20 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("how many elemnt ? ");
        int numElemnt = input.nextInt();
        System.out.println("Enter your values spearted by a space");
        for (int i = 0; i < numElemnt; i++) {
            list.add(input.nextInt());
        }
        System.out.println("Orignal : "+ list);
        System.out.println("largest Integer : "+largestInteger(list));
    }

    public static int largestInteger(ArrayList<Integer> list) {
        return largestInteger(list, 0, list.get(0));
    }

    public static int largestInteger(ArrayList<Integer> list, int index, int currentNum) {
        if (index == list.size()) {
            return currentNum;
        } else {
            int element = list.get(index);
            if (element > currentNum) {
                currentNum = element;
            }
            return largestInteger(list, index+1, currentNum);
        }
    }
}