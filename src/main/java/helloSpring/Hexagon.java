package helloSpring;

public class Hexagon {
    private String type;
    private int size;

    public Hexagon(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public Hexagon(String type) {
        this.type = type;
    }

    public Hexagon(int size) {
        this.size = size;
    }

    public void draw() {
        System.out.println(getType() + " | Drawing a beautiful Hexagon | Size: " + getSize());
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
