package lab6;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        boolean valide = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size");
        int Max = sc.nextInt();
        Container c1 = new Container(Max);


        while (valide){
            System.out.println("enter an a item");
            int input = sc.nextInt();

            if(!c1.addItem(input)) {
                valide = false;
                System.out.println(c1.mine());
            }
        }
    }
    }
