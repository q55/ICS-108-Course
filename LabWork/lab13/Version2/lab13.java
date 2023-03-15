package lab13.Version2;

import java.util.Arrays;

public class lab13 {
    public static void main(String[] args){
        City[] cities = new City[4];
        cities[0] = new City("med",42);
        cities[1] = new City("dmm",15);
        cities[2] = new City("jed",70);
        cities[3] = new City("aldyrh",5);

        Arrays.sort(cities);

        for (City city:cities){
            System.out.println(city);
        }
    }
}