public class Satellite extends SpaceObject implements Fly{
    public Satellite(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void displayInfo() {
        System.out.println("Satellite: " + getName() + ", " + getCoordinateX() + ", "
        + getCoordinateY() + ", " + getCoordinateZ() + ", " + getMass());
    }

    @Override
    public void flyTo(SpaceObject destination) {
        setCoordinateX(destination.getCoordinateX());
        setCoordinateY(destination.getCoordinateY());
        setCoordinateZ(destination.getCoordinateZ());
    }
}
