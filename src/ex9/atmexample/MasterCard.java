package ex9.atmexample;

public class MasterCard implements ICard {
    private int uin;
    private String cardholderName;
    private int amount;

    public MasterCard(int amount, String cardholderName) {
        this.cardholderName = cardholderName;
        this.amount = amount;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }
}
