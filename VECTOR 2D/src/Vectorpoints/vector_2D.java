package Vectorpoints;
import java.util.Vector;
public class vector_2D {
    private double x;
    private double y;

    public vector_2D() {
        this.x = 0;
        this.y = 0;
    }

    public vector_2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //  --------point - point = vector---------
    public static vector_2D getVector(point P1, point P2){
        vector_2D V = new vector_2D(P1.getX() - P2.getX() , P1.getY() - P2.getY());
        System.out.println(V);
        return V;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override
    public String toString() {
        return x + " , " + y;
    }
}

