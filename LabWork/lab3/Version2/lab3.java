package lab3.Version2;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] myList = new int[size];
        System.out.println("Enter the contents of the array: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        }

        if(isValid(myList)){
            System.out.println("The array is valid");
        }else {
            System.out.println("The array is not valid");

        }
    }

    public static boolean isValid(int[] array) {
        int sum=0, sumOfLingth = 0;

        for (Integer num:array){
            sum += num;
            if (num <=0 & num>array.length){
                return false;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sumOfLingth+=i;
        }
        for (int i = 0; i < array.length; i++) {
            int duplcate = 0;
            sum += array[1];
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    duplcate += 1;

                    if (duplcate >= 1 || sum != sumOfLingth ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}