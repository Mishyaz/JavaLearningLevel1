package ex2;

public class Main3Foreach {
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

        for (char[] row : cells) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

