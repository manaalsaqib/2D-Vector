package VectorOperations;
import Vectorpoints.*;
public class Subtraction {
    public vector_2D subtract(vector_2D P1, vector_2D P2){
        vector_2D difference = new vector_2D(P1.getX() - P2.getX(), P1.getY() - P2.getY());
        return difference;
    }
}
