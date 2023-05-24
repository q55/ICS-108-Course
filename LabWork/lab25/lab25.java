package lab25;

import java.util.ArrayList;

public class lab25 {

    public static void main(String[] args) {
        ArrayList<Integer> myList =new ArrayList<>();
        for (int i=0; i < 99999;i++){
            myList.add(i);
        }
        long startTime = System.nanoTime();
    //perform the task;
        for(int i =0; i<100000;i++){
            linerSearch(myList,i);
        }
    long endTime = System.nanoTime();
    long executionTime = endTime - startTime;
    System.out.println("LinearSearch took ----> "+executionTime);

        long startTime2 = System.nanoTime();
        //perform the task;
        for(int i =0; i<100000;i++){
            binarySearch(myList,i);
        }
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("binarySearch took ----> "+executionTime2);
}

public static int linerSearch(ArrayList<Integer> myList, int x) {
    for(int i=0; i <myList.size();i++){
        if (x == myList.get(i)){
                return i;
        }
    }
    return -1;
    }

    public static int binarySearch(ArrayList<Integer> myList, int key) {
        int low = 0;
        int high = myList.size()-1;

        while (low<high){
            int mid = (low+ high) / 2;

            if (key== myList.get(mid)){
                return mid;
            } else if (key < myList.get(mid)) {
                high = mid-1;
            }
            else {
                 low = mid+1;
            }

        }
        return -low-1;
    }
}
