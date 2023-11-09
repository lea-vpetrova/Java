public class Planet extends OrbitableSpaceObject implements Orbiter{
    Planet(String name, int coordinateX, int coordinateY, int coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void orbit(SpaceObject target) {

    }

    private Metal metal;
    private Gas gas;
    private  Crystal crystal;
    private  Uranium uranium;

    /*Resource(Metal metal, Gas gas, Crystal crystal, Uranium uranium)
    {
        super();
        this.metal = metal;
        this.gas = gas;
        this.crystal = crystal;
        this.uranium = uranium;
    }*/
}
