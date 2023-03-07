package lab6;

import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> list ;
    private final int MAX;
    private int sum;
    private boolean cond;

    public Container(int Max){
        sum = 0;
        this.MAX = Max;
        list= new ArrayList<>();

    }

    public boolean addItem(int itemWeight){
        if (sum + itemWeight <= MAX){
            list.add(itemWeight);
            this.sum += itemWeight;
            return true;
        }
        return false;
    }
    public ArrayList<Integer> mine(){
        return list;

    }
}
