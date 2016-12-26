package ex4;

public class MissionControlCenter {
    SpaceShip currentSpaceShip;

    public void setCurrentSpaceShip(SpaceShip currentSpaceShip) {
        this.currentSpaceShip = currentSpaceShip;
    }

    void lanch() {
        System.out.println("ЦУП разрешает взлет");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Обратный отсчет:" + i);
        }
        System.out.println("Пуск");
        currentSpaceShip.lanch();
    }
}
