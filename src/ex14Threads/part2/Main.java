package ex14Threads.part2;

import java.io.IOException;

public class Main {
    public volatile static boolean flag = true;

    static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            while (flag) {
            }
            System.err.println("ThreadFlagReader завершился!" + flag);
        }
    }

    static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                int read = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            flag = false;
            System.err.println("flag set to " + flag);
        }
    }

    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();
    }
}
