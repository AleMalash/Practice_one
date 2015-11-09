package Entity;

import Abstract.Model;
import Entity.Fundamental.Triangle;
import Interface.*;

import java.util.List;

/**
 * Created by Alexander on 09.11.2015.
 */
public class Butterfly extends Model implements Body, Head, Wings {
    public void setBodyPolygons(List<Triangle> inputPolygons){};
    public void setHeadPolygons(List<Triangle> inputPolygons){};
    public void setWingsPolygons(List<Triangle> inputPolygons){};

}
