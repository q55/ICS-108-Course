package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        int arraySize, sum, sum2;
        String n;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        arraySize = sc.nextInt();
        System.out.println("Enter the contents of the array: ");
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        n = sc.nextLine();

        sum = 0;
        for (int i = 1; i <= arraySize; i++) {
            sum += i;
        }

        sum2 = 0;
        for (int i = 0; i < arraySize; i++) {
            sum2 += array[i];
        }

        if (isValid(array) & sum == sum2 & (n.equals("") || n.equals(" "))) {
            System.out.println("The array is valid");
        } else {
            System.out.println(n);
            System.out.println("The array is not valid");
        }
    }
    public static boolean isValid(int[] array){
        int count = 0;
        //System.out.println(array.length);
        for(int i = 1 ; i <= array.length;i++){
            for(int x = 1 ; x <= array.length;x++) {
                if (i == array[x - 1]){
                    count += 1;}
            }
            if(count > 1)
                return false;
            count =0;
        }
        return true;
    }
}