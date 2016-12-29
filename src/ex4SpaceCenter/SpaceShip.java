package ex4SpaceCenter;

public class SpaceShip implements Flyable{
    Step[] steps;
    Pilot pilot;
    String name;

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public void launch() {
        System.out.println("Корабль запущен c пилотом: " + pilot.name);
    }


}
