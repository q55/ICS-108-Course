public class point {



double x,y;

point(){
 x = 0;
 y = 0;
}

public point(double xp, double yp){
    x = xp;
    y = yp;
}

    public double distance(point p){

        return Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y- p.y,2));


    }









}
