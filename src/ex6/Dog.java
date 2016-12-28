package ex6;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("wof, wof!");
        System.out.print("Обращаемся к предку: ");
        super.voice();
    }
}
