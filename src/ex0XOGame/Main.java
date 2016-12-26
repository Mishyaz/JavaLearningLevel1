package ex0XOGame;

public class Main {

    public static final int FIELD_SIZE = 3;

    public static void main(String[] args) {
        char[][] cells = new char[FIELD_SIZE][4];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                cells[i][j] = '.';
            }
        }

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
