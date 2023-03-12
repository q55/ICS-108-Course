package lab7.Version2;

import java.util.ArrayList;

public class Container {
    private int sum;
    private int maximumWight;
    private ArrayList<Integer> containerList ;

    public Container(int maximumWight){
        this.sum=0;
        this.maximumWight = maximumWight;
        this.containerList = new ArrayList<>();
    }

    public boolean addItem(int itemWeight){
        if(sum+itemWeight<=maximumWight){
            this.sum += itemWeight;
            containerList.add(itemWeight);
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getContainerList(){
        return containerList;
    }
}