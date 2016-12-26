package ex2;

public class Main2 {
    public static void main(String[] args) {
        char[][] cells = new char[3][4];
        cells[0] = new char[4];
        cells[1] = new char[1];
        cells[2] = new char[5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = '.';
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
