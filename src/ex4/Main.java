package ex4;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Василий");
        SpacePort baikonur = new SpacePort();
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.name = "ВОСТОК";
        spaceShip.setPilot(pilot);
//        baikonur.spaceShip = spaceShip;
        baikonur.setSpaceShip(spaceShip);
        baikonur.setMissionControlCenter(new MissionControlCenter());
        baikonur.missionControlCenter.setCurrentSpaceShip(spaceShip);

        baikonur.missionControlCenter.lanch();
    }
}
