package ex8XOGameGraphic.Model;

public class User implements Shootable {
    public static Point point;
    public volatile static boolean isShoot;

    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot);  //неидеальный вариант
        return point;
    }
}
