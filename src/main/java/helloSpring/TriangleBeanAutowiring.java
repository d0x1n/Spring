package helloSpring;

public class TriangleBeanAutowiring {
    private Position positionX;
    private Position positionY;
    private Position positionZ;

    public Position getPositionX() {
        return positionX;
    }

    public void setPositionX(Position positionX) {
        this.positionX = positionX;
    }

    public Position getPositionY() {
        return positionY;
    }

    public void setPositionY(Position positionY) {
        this.positionY = positionY;
    }

    public Position getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(Position positionZ) {
        this.positionZ = positionZ;
    }

    public void draw() {
        System.out.println("\n\n\t Drawing a Triangle Bean Autowiring");
    }
}
