package ex4;

public class SpaceShip {
    Step[] steps;
    Pilot pilot;
    String name;

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    void lanch() {
        System.out.println("Корабль запущен c пилотом: " + pilot.name);
    }
}
