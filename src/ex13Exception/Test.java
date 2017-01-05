package ex13Exception;

import java.io.IOException;

public class Test {
    void foo1() {
        foo2();
    }

    void foo2() {
//        if (test1() == - 1) {
//            System.out.println("error in test1()");
//        }
//        if (!test2()) {
//            System.out.println("error in test2()");
//        }
        try {
            test3();
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("ошибка!");
        }
    }

    int test1() {
        return -1;
    }

    boolean test2() {
        return false;
    }

    Cat test3() throws IOException {
        //ошибка!
        Exception exception = new Exception("Our exception");
//        throw exception; //передача сообщения и одновременный выход из метода
//        return new Cat();
        int[] ints = new int[10];
        ints = null;
//        ints[12] = 10;
        throw new IOException();
//        throw new Throwable();
    }
}
