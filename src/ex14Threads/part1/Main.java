package ex14Threads.part1;

public class Main {
    static class Recipe implements Runnable {
        void cook() {
            System.err.println(Thread.currentThread().getName());
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++)
            System.err.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());
        thread.start();
        thread.setName("Повар");
        System.err.println(Thread.currentThread().getName());
        new Thread(new Recipe()).start();
        new Thread(new Recipe()).start();
        new Thread(new Recipe()).start();
    }
}
