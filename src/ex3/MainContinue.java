package ex3;

public class MainContinue {
    public static void main(String[] args) {
        int i = 0;
//        while (true) {
//            if (i == 5) {
//                break;
//            }
//            i++;
//            if (i == 3) {
//                continue;
//            }
//            System.out.println(i);
//        }
        M://метка
        while (true) {
            while (true) {
                do {
                    if (i == 5) {
                        break M;//выход на метку
                    }
                    i++;
                    System.out.println(i);
                } while (true);
            }
        }
        System.out.println("End");
    }
}
