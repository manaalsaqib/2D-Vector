package VectorOperations;
import Vectorpoints.point;
import Vectorpoints.vector_2D;

public class Magnitude{
    private double p1;
    private double p2;

    public static double Magnitude(vector_2D v1, vector_2D v2){
        Magnitude mag = new Magnitude();
        double magnitude = (Math.sqrt(Math.pow(v1.getX() - v2.getX(),2) + Math.pow(v1.getY() -v2.getY(),2)));
        return magnitude;
    }
//  --------sqrt/x^2 + Y^2-------


        }








