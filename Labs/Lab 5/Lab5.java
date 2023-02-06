public class Lab5 {
    public static void main(String[] args) {
        point firstPoint = new point();
        point secondPoint = new point(10,30.5);
        double value = firstPoint.distance(secondPoint);
        System.out.println(value);

    }


    
}
