package ex1;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Kitty", "Vasilia", "Myrka"};
        int[] ages = {3, 2, 5};
        int[] lives;
        lives = new int[3];
        lives[0] = 7;
        lives[1] = 7;
        lives[2] = 7;

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        for (int age : ages) {
            System.out.println(age);
        }
    }
}