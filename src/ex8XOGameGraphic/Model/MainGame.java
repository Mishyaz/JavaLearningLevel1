package ex8XOGameGraphic.Model;

public class MainGame {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static User user = new User();

    public static void start() {
        field.show();
        for (int i = 0; i < 10; i++) {
            field.doShoot(computer.getShoot(), Field.Type.X);
            field.show();
            //check win

            field.doShoot(user.getShoot(), Field.Type.O);
            field.show();
            //check win

        }
    }
}
