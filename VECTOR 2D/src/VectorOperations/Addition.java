package VectorOperations;
import Vectorpoints.*;
public class Addition {
    public vector_2D add(vector_2D P1, vector_2D P2){
        vector_2D sum = new vector_2D(P1.getX() + P2.getX() , P1.getY() + P2.getY());
                return sum;
    }
}
