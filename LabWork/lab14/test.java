package lab14;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Point[] points = generateRandomPoints(10);
        System.out.println("Unsorted points:");
        System.out.println(Arrays.toString(points));

        Arrays.sort(points);
        System.out.println("Sorted points:");
        System.out.println(Arrays.toString(points));
    }

    public static Point[] generateRandomPoints(int numPoints) {
        Random random = new Random();
        Point[] points = new Point[numPoints];
        for (int i = 0; i < numPoints; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            points[i] = new Point(x, y);
        }
        return points;
    }
}

