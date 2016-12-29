package ex7;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.voice();

        Animal[] animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Cat();
        }
        for (Animal animal1 : animals) {
            animal1.voice();
        }
    }
}
