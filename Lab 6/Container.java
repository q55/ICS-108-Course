import java.util.ArrayList;
import java.util.Scanner;

public class Container {
    ArrayList<Integer> list = new ArrayList<>();
    int Max;
    int SUM = 0;

    public Container(int Max){
    this.Max = Max;
    }

    public boolean addItem(int itemWeight){
        //System.out.println(list);
        this.SUM += itemWeight;
        if (SUM<=Max){
            list.add(itemWeight);
            return true;
        }else {
            return false;
        }

    }
    public ArrayList<Integer> mine(){
        return list;

    }
}
