package Entity;

import Abstract.Model;
import Entity.Fundamental.Triangle;
import Interface.*;

import java.util.List;

/**
 * Created by Alexander on 09.11.2015.
 */
public class Mouse extends Model implements Body, Fingers, Head, Limb, Toes, Tail {
    public void setBodyPolygons(List<Triangle> inputPolygons){};
    public void setFingersPolygons(List<Triangle> inputPolygons){};
    public void setHeadPolygons(List<Triangle> inputPolygons){};
    public void setLimbPolygons(List<Triangle> inputPolygons){};
    public void setToesPolygons(List<Triangle> inputPolygons){};
    public void setTailPolygons(List<Triangle> inputPolygons){};

    @Override
    public void dosmth() {

    }
}
