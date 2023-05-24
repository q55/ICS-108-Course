package lab20;

import java.util.ArrayList;
import java.util.Scanner;
public class RecursiveLargestElement {

 public static int findLargest(ArrayList<Integer> arrList) {
  if (arrList == null || arrList.isEmpty()) {
   throw new IllegalArgumentException("ArrayList cannot be null or empty");
  }
  if (arrList.size() == 1) {
   return arrList.get(0);
  } else {
   int first = arrList.get(0);
   ArrayList<Integer> rest = new ArrayList<>(arrList.subList(1, arrList.size()));
   int largestInRest = findLargest(rest);
   if (first > largestInRest) {
    return first;
   } else {
    return largestInRest;
   }
  }
 }

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  ArrayList<Integer> arrList = new ArrayList<>();
  System.out.print("Enter the number of integers in the array list: ");
  int n = scanner.nextInt();
  System.out.printf("Enter %d integers:%n", n);
  for (int i = 0; i < n; i++) {
   int num = scanner.nextInt();
   arrList.add(num);
  }
  int largest = findLargest(arrList);
  System.out.printf("The largest element in the array list is %d.%n", largest);
 }

}