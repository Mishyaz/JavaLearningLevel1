package ex4SpaceCenter;

public class Rocket implements Flyable {
    String sputnik;

    public Rocket(String sputnik) {
        this.sputnik = sputnik;
    }

    @Override
    public void launch() {
        System.out.println("Rocket is launched with " + sputnik);
    }

    @Override
    public void landing() {

    }
}
