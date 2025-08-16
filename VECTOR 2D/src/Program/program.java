package Program;
import VectorOperations.*;
import Vectorpoints.*;
import Drawing.*;

import javax.swing.*;
import java.awt.*;

public class program {
    public void run(){
//  -----------VectorPoints---------

        point p1 = new point(15, 25);
        point p2 = new point(50, 75);

        vector_2D v1;
        v1 = vector_2D.getVector(p1,p2);
        System.out.println("X component of the vector: "+ v1.getX());
        System.out.println("Y component of the vector is: "+ v1.getY());


        point p3 = new point(100,125 );
        point p4 = new point(150, 175);

        vector_2D v2;
        v2 = vector_2D.getVector(p3,p4);
        System.out.println("X component of the vector is: "+ v2.getX());
        System.out.println("Y component of the vector is: "+ v2.getY());


//        -----vector operations-----
        Addition sum = new Addition();
        System.out.println("Sum of two Vectors is: "+sum.add(v1,v2));

        Subtraction difference = new Subtraction();
        System.out.println("Difference of two vectors is: "+difference.subtract(v1,v2));

        Product product = new Product();

        System.out.println("Dot Product of the Vector is: "+ product.dotProduct(v1,v2));
        System.out.println("Cross Product of the Vectors is: "+ product.crossProduct(v1,v2));

        Magnitude magnitude = new Magnitude();
        System.out.println("Magnitude of the Vector is: " + Magnitude.Magnitude(v1,v2));


//        ---drawing---

        Line Line1 = new Line(p1,p2);
        Line Line2 = new Line(p3,p4);

        System.out.println("Length of Line 01 is: "+ Line1.Length());
        System.out.println("Line 01's starting points are:  ("+ Line1.getStart().getX()+","+Line1.getStart().getY()+")");
        System.out.println("Line 01's Ending points are:  (" + Line1.getEnd().getX()+","+ Line1.getEnd().getY()+")");

        System.out.println("Length of Line 02 is: "+ Line2.Length() );
        System.out.println("Line 02's starting points are: ("+ Line2.getStart().getX()+","+Line2.getStart().getY()+")");
        System.out.println("Line 02's Ending points are:  (" + Line2.getEnd().getX()+","+ Line2.getEnd().getY()+")");

        JFrame jFrame = new JFrame("Vectors");
        canvas Canvas = new canvas(Line1 , Line2);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.add(Canvas);



    }
}



