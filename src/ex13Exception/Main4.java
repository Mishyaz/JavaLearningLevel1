package ex13Exception;

public class Main4 {
    public static void main(String[] args) {
//        try {
        System.out.println("calculation: " + doTest());
        System.out.println("1");
        System.out.println("2");
//        } catch (Exception e) {
//
//        }
    }

    private static int doTest() {
        int i = 3;
        try {
            if (i == 3) {
                throw new Exception();
            }
        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(0);
            return i;
        } finally {
            i = 100;
        }
//        throw new RuntimeException();
        return -1;
    }
}
