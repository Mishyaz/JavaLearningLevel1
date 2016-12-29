package ex4SpaceCenter;

public class MissionControlCenter {
    Flyable currentSpaceShip;

    public void setCurrentFlyable(Flyable currentSpaceShip) {
        this.currentSpaceShip = currentSpaceShip;
    }

    void lanch() {
        System.out.println("ЦУП разрешает взлет");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Обратный отсчет:" + i);
        }
        System.out.println("Пуск");
        currentSpaceShip.launch();
    }
}
