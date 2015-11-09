package Entity.Fundamental;


/**
 * Created by Alexander on 08.11.2015.
 */
public class Triangle{
    public Triangle(Vertex inputA, Vertex inputB, Vertex inputC){
        a = inputA;
        b = inputB;
        c = inputC;
    }
    Vertex a;
    Vertex b;
    Vertex c;

    public Vertex getA(){return a;}
    public Vertex getB(){return b;}
    public Vertex getC(){return c;}
}
