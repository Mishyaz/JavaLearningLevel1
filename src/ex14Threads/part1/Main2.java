package ex14Threads.part1;

public class Main2 {
    static class Jamy extends Thread {
        @Override
        public void run() {
            System.out.println(getName());
        }

        public static void main(String[] args) {
            Thread jamy = new Jamy();
            jamy.start();
        }
    }
}
