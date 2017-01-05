package ex13Exception;

import java.io.IOException;

public class Test2 {
    void foo2() throws IOException {
        try {
            test3();
        } catch (OurException e) {
            System.out.println("поймали OurException");
        } catch (Exception e) {
            System.out.println("поймали ошибку");
            return;
//            throw new IOException();
        } finally {
            System.out.println("освободили ресурсы");//правильный
        }
//        System.out.println("освободили ресурсы"); //неправильный
        System.out.println("Next part of program");
//        AutoCloseable;
    }

    Cat test3() throws IOException, OurException {
        Exception exception = new Exception("Our exception");
        int[] ints = new int[10];
        ints = null;
//        ints[12] = 1;
        throw new OurException("что то пошло не так");
//        return new Cat();
    }
}
