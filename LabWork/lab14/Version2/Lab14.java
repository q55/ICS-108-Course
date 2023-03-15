package lab14.Version2;

import java.util.Arrays;

public class Lab14 {
    public static void main(String[] args) {
        Point[] myList = new Point[5];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = new Point((int)(Math.random()*10), (int)(Math.random()*10));
        }

        System.out.println("before");
        System.out.println(Arrays.toString(myList));

        Arrays.sort(myList);

        System.out.println("after");
        System.out.println(Arrays.toString(myList));



    }
}
