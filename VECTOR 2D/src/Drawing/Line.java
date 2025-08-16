package Drawing;
import VectorOperations.*;
import Vectorpoints.*;

public class Line {
    private point start;
    private point end;

    public Line(point start, point end){
        this.start = start;
        this.end = end;
    }
    public point getStart(){
        return start;
    }
    public point getEnd(){
        return end;
    }

    public double Length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}


