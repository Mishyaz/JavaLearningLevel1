package ex6;

public class Main1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Fox();
        animals[3] = new Fox();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).destroySofa();
            } else if (animal instanceof Dog) {
                animal.voice();
            }
        }


    }
}
