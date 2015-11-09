/*
does 3D structure exist?
override List to List
* */
package Abstract;

/**
 * Created by Alexander on 08.11.2015.
 */

import java.util.List;
import Entity.Fundamental.Triangle;
import Entity.Fundamental.Vertex;

public abstract class Model {

    protected List<Triangle> content;
    double weight;

    public void treangulate(){
        List<Triangle> temp = content;
        int i = 0;
        for (int count = 0; count <content.size(); count ++){
            temp.add(content.get(count));
        }
        for (int count = 0; count < content.size(); count ++){
            temp.add(i ,new Triangle(content.get(count).getA(), new Vertex(content.get(count).getB().getX() - content.get(count).getA().getX(), content.get(count).getB().getY() - content.get(count).getA().getY(), content.get(count).getB().getZ() - content.get(count).getA().getZ()) , content.get(count).getC()));
            temp.add(i + 1, new Triangle (new Vertex(content.get(count).getB().getX() - content.get(count).getA().getX(), content.get(count).getB().getY() - content.get(count).getA().getY(), content.get(count).getB().getZ() - content.get(count).getA().getZ()), content.get(count).getB(), content.get(count).getC()));
            i+=2;
        }
        content.clear();
        for (int count = 0; count < temp.size(); count ++){
            content.add(temp.get(count));
        }
        calculateweight();
    }

    public void calculateweight(){
        this.weight = content.size() * 1.8;
    }

    public double getWeight(){return weight;}
}