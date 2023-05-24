package lab24;
import java.util.*;
import java.io.*;

    public class Lab24 {
        public static void main(String[] args) throws IOException {
            TreeMap<String, TreeSet<Integer>> majors = new TreeMap<>();
            File file = new File("students.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                int id = Integer.parseInt(line[0]);
                String major = line[1];
                TreeSet<Integer> ids = majors.getOrDefault(major, new TreeSet<>());
                ids.add(id);
                majors.put(major, ids);
            }
            scanner.close();
            for (Map.Entry<String, TreeSet<Integer>> entry : majors.entrySet()) {
                String major = entry.getKey();
                TreeSet<Integer> ids = entry.getValue();
                System.out.println(major + ": " + ids);
            }
        }
    }