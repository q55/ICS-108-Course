package lab24.Version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class lab24 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("lab24data");

        TreeMap<String, TreeSet<Integer>> majors = new TreeMap<>();

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            Integer num = input.nextInt();
            String majorData = input.next();

            // Check if the major exists in the TreeMap
            if (majors.containsKey(majorData)) {
                TreeSet<Integer> set = majors.get(majorData);
                set.add(num);
            } else {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(num);
                majors.put(majorData, set);
            }
        }

        input.close();

        // Iterate through the TreeMap and print each major and its enrolled students
        Iterator<String> iterator = majors.keySet().iterator();
        while (iterator.hasNext()) {
            String major = iterator.next();
            TreeSet<Integer> students = majors.get(major);
            System.out.println(major + ": " + students);
        }
    }
}
