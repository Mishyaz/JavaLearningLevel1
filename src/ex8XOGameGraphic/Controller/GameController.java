package ex8XOGameGraphic.Controller;

import ex8XOGameGraphic.Model.Field;
import ex8XOGameGraphic.Model.Point;
import ex8XOGameGraphic.Model.User;

public class GameController {
    public static void doShoot(Point point, Field.Type tipe) {
        User.point = point;
        User.isShoot = true;
    }
}
