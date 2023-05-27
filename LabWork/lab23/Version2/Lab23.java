package lab23.Version2;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab23 {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<>();
        for(int i=2;i<101;i++){
            myList.add(i);
        }

        for(int i = 2;i<5;i++){
            Iterator<Integer> iterator = myList.iterator();
            while (iterator.hasNext()){
                Integer num = iterator.next();
                if( num != i & num % i == 0){
                    iterator.remove();
                }
            }
        }

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.print(element +"   ");
        }
    }
}