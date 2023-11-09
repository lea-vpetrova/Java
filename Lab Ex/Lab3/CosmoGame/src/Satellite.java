public class Satellite extends SpaceObject implements Orbiter{
    Satellite(String name, int coordinateX, int coordinateY, int coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void orbit(SpaceObject target) {

    }
}
