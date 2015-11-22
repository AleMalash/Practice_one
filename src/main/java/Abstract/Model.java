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
import Entity.Human;
import org.apache.log4j.Logger;

public abstract class Model {
    private static final Logger log = Logger.getLogger(Human.class);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        log.info("Name has been initialized!");
    }

    String name;

    public List<Triangle> getContent() {
        return content;
    }

    public void setContent(List<Triangle> content) {
        this.content = content;
        log.info("Content has been initialized!");
    }

    protected List<Triangle> content;

    public void setWeight(double weight) {
        this.weight = weight;
        log.info("Weight has been initialized!");
    }

    double weight;

    public abstract void dosmth();

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
        log.info("Model has been treangulated!");
    }

    public void calculateweight(){
        this.weight = content.size() * 1.65;
        log.info("Weight has been update!");
    }

    public double getWeight(){return weight;}
}

//Add unittests, logs, mock-tests
//big decimal - for money
// double - negative pow of 2