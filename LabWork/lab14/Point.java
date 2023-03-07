package lab14;

public class Point implements Comparable<Point> {
    int x , y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (this.x > point.x) {
            return 1;
        } else if (this.x < point.x) {
            return -1;
        } else if (this.y > point.y) {
            return 1;
        } else if (this.y < point.y) {
            return -1;
        } else {
            return 0;
        }
    }


        @Override
        public boolean equals(Object point){
            if (this == point) {
                return true;
            }

            if (!(point instanceof Point)) {
                return false;
            }

            Point other = (Point) point;
            return this.x == other.x && this.y == other.y;
        }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
