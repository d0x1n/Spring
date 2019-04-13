package helloSpring;

public class Triangle {
    private String type;

    public void draw() {
        System.out.println(getType() + " | Drawing a Triangle");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
