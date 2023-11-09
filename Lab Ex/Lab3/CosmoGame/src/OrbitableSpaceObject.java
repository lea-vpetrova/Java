import java.util.ArrayList;
import java.util.List;

abstract public class OrbitableSpaceObject extends SpaceObject{
    OrbitableSpaceObject(String name, int coordinateX, int coordinateY, int coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }
    private List<SpaceObject> orbiters = new ArrayList<>() {
    };
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    void addOrbiter(SpaceObject orbiter){

    }

    public List<SpaceObject> getOrbiters() {
        return orbiters;
    }
}
