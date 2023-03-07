package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");

        int numberOfObjects = myInput.nextInt();
        int[] objects = new int[numberOfObjects];

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < numberOfObjects; i++) {
            objects[i] = myInput.nextInt();
        }
        System.out.println(Arrays.toString(objects));

        int sum = 0;

        ArrayList <Integer> list = new ArrayList<>();
        for (int num : objects){
            if (num + sum < 10){
                sum += num;
                list.add(num);
            }
            else{
            }
                if (num + sum < 10){
                    sum += num;
                    list.add(num);
            }
        }
        sum = 0;
        System.out.println(list);
        }
    }