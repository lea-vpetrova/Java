import java.util.List;

public class Star extends OrbitableSpaceObject implements Orbiter{
    public Star(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void addOrbiter(SpaceObject orbiter) {
        System.out.println("Star: " + getName() + ", " + getCoordinateX() + ", "
                + getCoordinateY() + ", " + getCoordinateZ() + ", " + getMass());
    }

    @Override
    public List<SpaceObject> getOrbiters() {
        return super.getOrbiters();
    }

    @Override
    public void orbit(SpaceObject target) throws NoneValidSpaceObject {
        addOrbiter(target);
    }
}
