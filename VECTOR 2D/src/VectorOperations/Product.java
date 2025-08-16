package VectorOperations;
import Vectorpoints.point;
import Vectorpoints.vector_2D;

public class Product {
    private point P1;
    private point P2;

//    -----dot product of two vectors return scalar quantity----
    public double dotProduct(vector_2D V1, vector_2D V2){
        double Scalar = (V1.getX()*V2.getX()) + (V1.getY()*V2.getY());
        return Scalar;

    }
//    ------Cross Product of two vectors also return a scalar quantity------
//    ------ v1 x v2 = (v1.x * v2.y) - (v1.y * v2.x)--------
    public double crossProduct(vector_2D V1, vector_2D V2){
        double Scalar = (V1.getX()*V2.getY()) - (V1.getY()*V2.getX());
        return Scalar;
    }

}
