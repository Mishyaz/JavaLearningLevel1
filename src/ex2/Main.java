package ex2;

public class Main {
    public static void main(String[] args) {
        char[][] cells = new char[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                cells[i][j] = '.';
            }
        }
//        System.out.println(Arrays.deepToString(cells));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
