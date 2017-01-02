package ex9.atmExample;

public interface IAtm {
    void insertCard(ICard card);

    void eject();

    void withDraw(int amount);

//    void checkPin();

    void getBalance();

//    void getTransaction();
}
