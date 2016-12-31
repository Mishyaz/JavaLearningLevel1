package ex8XOGameGraphic.Model;

public class Computer implements Shootable {
    @Override
    public Point getShoot() {
        return Point.getRundomPoint();
    }
}
