package Interface;

/**
 * Created by Alexander on 08.11.2015.
 */
import java.util.List;
import Entity.Fundamental.Triangle;

public interface Body {
    public void setBodyPolygons(List<Triangle> inputPolygons);
}
