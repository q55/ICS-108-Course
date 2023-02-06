import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab4_3 {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int numberOfObjects = myInput.nextInt();
        int[] objects = new int[numberOfObjects];

        System.out.print("Enter the weights of the objects: ");
        for (int i=0; i<numberOfObjects; i++){
            objects[i]= myInput.nextInt();
        }

        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        int i=-1;
        boolean isContained = true;

        while (isContained){
            if (i>=numberOfObjects) {
                isContained = false;
            }
            i++;
            for (ArrayList<Integer> container : containers){
                System.out.println(container);
                int weight = 0;
                for (int obj : container){
                    weight+=obj;
                }
                if (weight + objects[i]<=10){
                    container.add(objects[i]);
                    isContained = false;

                }
            }
            if (!isContained){
                ArrayList<Integer> container = new ArrayList<>();
                container.add(objects[i]);
                containers.add(container);

            }
        }
        for (int x=0; x<containers.size();x++) {
            System.out.print("Container " + (x + 1) + " contains objects with weight ");
            for (int obj : containers.get(x)) {
                System.out.print(obj + " ");
            }
            System.out.println();

        }


    }

}