package ex9.atmexample;

public class Atm implements IAtm{
    private ICard currentCard;

    @Override
    public void insertCard(ICard card) {
        currentCard = card;
    }

    @Override
    public void eject() {
        currentCard = null;
        System.out.println("Card was ejected");
    }

    @Override
    public void withDraw(int amount) {
        if (checkAvailableCard()) return;
        if (currentCard.withdraw(amount)) {
            System.out.println("Cash: " + amount + ", new balance " + currentCard.getBalance());
            eject();
        } else {
            System.out.println("Not enough money");
        }
    }

    private boolean checkAvailableCard() {
        if (currentCard == null) {
            System.out.println("No card");
            return true;
        }
        return false;
    }

    @Override
    public void getBalance() {
        if (checkAvailableCard()) return;
        System.out.println("Balance: " + currentCard.getBalance());
    }
}
