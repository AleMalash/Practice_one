package Entity.Fundamental;

/**
 * Created by Alexander on 08.11.2015.
 */
public class Vertex{
    public Vertex(double inputX, double inputY, double inputZ){
        x = inputX;
        y = inputY;
        z = inputZ;
    }
    double x;
    double y;
    double z;

    public double getX(){return x;}
    public double getY(){return y;}
    public double getZ(){return z;}
}
