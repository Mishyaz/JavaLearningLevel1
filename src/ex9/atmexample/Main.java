package ex9.atmexample;

public class Main {
    public static void main(String[] args) {
        IAtm superAtm = new Atm();
        ICard gouldCard = new MasterCard(1000, "Tom");

        superAtm.insertCard(gouldCard);
        superAtm.getBalance();
        superAtm.withDraw(900);
        superAtm.withDraw(200);
        superAtm.getBalance();

        superAtm.insertCard(gouldCard);
        superAtm.withDraw(200);
        superAtm.getBalance();
    }
}
