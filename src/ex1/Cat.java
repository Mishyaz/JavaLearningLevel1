package ex1;

public class Cat {
    String name;
    int ages;
    int lives;
    double weight;
    String color;

    public Cat() {
        System.out.println("test Cat constructor");
    }

    void voice() {
        System.out.println("My, my!");
    }

    void play() {
        System.out.println("cat playing.");
    }
}
