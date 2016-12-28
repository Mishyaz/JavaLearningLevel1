package ex6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        cat.voice();
        Dog dog = new Dog();
        dog.name = "Sharik";
        System.out.println("Name is: " + dog.name);
        dog.voice();
        dog.about();

        Animal animal = new Dog();
//        Animal animal1 = new Animal("test");
    }
}
