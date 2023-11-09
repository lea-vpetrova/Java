import java.util.ArrayList;
import java.util.List;

abstract class OrbitableSpaceObject extends SpaceObject {
    private List<SpaceObject> orbiters;

    public OrbitableSpaceObject(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters = new ArrayList<>();
    }


    public void addOrbiter(SpaceObject orbiter) {
        orbiters.add(orbiter);
    }


    public List<SpaceObject> getOrbiters() {
        return orbiters;
    }
}