import Entity.Fundamental.Triangle;
import Entity.Human;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Alexander on 09.11.2015.
 */
public class Main {
    public static void main(String[] args){

        List<Triangle> myL = new ArrayList<Triangle>();
        Human alex = new Human("Alex", myL, 10);
        alex.calculateweight();
        System.out.println("asda");

    }
}
