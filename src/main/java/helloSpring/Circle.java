package helloSpring;

public class Circle {
    private Position positionA;
    private Position positionB;

    public Position getPositionA() {
        return positionA;
    }

    public void setPositionA(Position positionA) {
        this.positionA = positionA;
    }

    public Position getPositionB() {
        return positionB;
    }

    public void setPositionB(Position positionB) {
        this.positionB = positionB;
    }

    public void draw() {
        System.out.println("Drawing a Circle :]");
    }

}
