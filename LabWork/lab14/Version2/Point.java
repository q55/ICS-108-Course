package lab14.Version2;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x =x;
        this.y =y;
    }
    @Override
    public int compareTo(Point point){
        if(this.x > point.x){
            return 1;
        }
        else if(this.x < point.x){
            return -1;
        }
        else {
            if (this.y > point.y){
                return 1;
            }
            else if (this.y < point.y) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Point){
            Point p = (Point) o;
            return this.y==p.y && this.x==p.x;
        }
        return false;

    }
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }


}
