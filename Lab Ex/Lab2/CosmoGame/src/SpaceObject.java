abstract public class SpaceObject {
    private String name;
    private Integer coordinateX;
    private Integer coordinateY;
    private Integer coordinateZ;
    private Double mass;

    SpaceObject(String name, int coordinateX,int coordinateY, int coordinateZ, double mass)
    {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.mass = mass;

    }
    void displayInfo(){
        System.out.println("Display Info about space object");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Integer getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(Integer coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }
}
