package lab6.Version2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Container myContiner = new Container(10);
        System.out.println("Enter an item");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        while (myContiner.addItem(userInput)){
            System.out.println("Enter an item");
            userInput = input.nextInt();
        }
        System.out.println(myContiner.getContainerList());
    }
}