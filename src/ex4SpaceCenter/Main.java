package ex4SpaceCenter;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
        SpacePort baikonur = new SpacePort();
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.name = "ВОСТОК";
        spaceShip.setPilot(pilot);
//        baikonur.spaceShip = spaceShip;
//        baikonur.setSpaceShip(spaceShip);
        baikonur.setMissionControlCenter(new MissionControlCenter());
        baikonur.missionControlCenter.setCurrentFlyable(spaceShip);
        baikonur.missionControlCenter.lanch();

        Rocket rocket = new Rocket("SPUTNIK");
        baikonur.missionControlCenter.setCurrentFlyable(rocket);
        baikonur.missionControlCenter.lanch();

        baikonur.missionControlCenter.setCurrentFlyable(new Flyable() {
            @Override
            public void launch() {
                System.out.println("UFO");
            }

            @Override
            public void landing() {
                System.out.println("brake");
            }
        });

        baikonur.missionControlCenter.lanch();
    }
}
