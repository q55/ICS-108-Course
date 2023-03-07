package lab5.practise;

public class Point {
    private double x , y ;

    public Point() {
    }
    public Point(double x,double y) {
        this.x = x;
        this.y = y;


    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        double newX = p.getX() - x;
        double newY = p.getY() - y;
        return Math.sqrt(Math.pow(newX,2)+Math.pow(newY,2));
    }

}
