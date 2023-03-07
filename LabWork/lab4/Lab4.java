package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args){
        int numberOfObjects;
        final int CONT_MAX = 10;
        boolean validatae;

        System.out.println("Enter the number of objects: ");
        Scanner sc = new Scanner(System.in);
        numberOfObjects = sc.nextInt();

        int[] array = new int[numberOfObjects];
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the weights of the objects: ");
        for (int i=0; i < numberOfObjects ;i++){
            list.add(sc.nextInt()) ;
        }
        for (int i=1; i <= list.size() ;i++){
            validatae = true;
            for (int x=1; x < list.size() ;x++){
                if (list.get(i - 1) + list.get(x) < CONT_MAX) {
                    System.out.printf("Container %d contains objects with weight %d %d", i, list.get(i - 1), list.get(x));
                    System.out.println();
                    //list.remove(i-1);
                    list.remove(x);

                    validatae = false;
                }


            }
            if (validatae){
                System.out.printf("Container %d contains objects with weight %d", i, list.get(i - 1));
                System.out.println();
                //list.remove(i-1);

            }

        }
        }

}
