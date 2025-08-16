package Vectorpoints;

public class point {
    private double x;
    private double y;

    public point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
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
