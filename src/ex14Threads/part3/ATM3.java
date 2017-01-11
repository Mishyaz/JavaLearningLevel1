package ex14Threads.part3;

public class ATM3 {
    private static int money = 100;
    private static final Object key = new Object();

    static void getMoney(int amount) {
        synchronized (key) {
            if (amount <= money) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money -= amount;
                System.out.println("All OK! New amount: " + money);
            } else {
                System.out.println("Not enough money");
            }
        }
        System.out.println("well done");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Hikky: ");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Mik: ");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Nikki: ");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Alice: ");
                getMoney(50);
            }
        }).start();
    }
}
