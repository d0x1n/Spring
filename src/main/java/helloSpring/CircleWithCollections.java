package helloSpring;

import java.util.List;

public class CircleWithCollections {
    private List<Position> position;

    public List<Position> getPosition() {
        return position;
    }

    public void setPosition(List<Position> position) {
        this.position = position;
    }

    public void draw() {
        for(Position position : position) {
            System.out.println("X: " + position.getX() + " | Y: " + position.getY());
        }
        System.out.println("Drawing a Circle :]");
    }

}
