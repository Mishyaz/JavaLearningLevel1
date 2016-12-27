package ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCount());
        Cat cat = new Cat();
//        cat.age = 10000;
        cat.setAge(18);
//        System.out.println(cat.getAge());
        cat.setAlive(false);
//        System.out.println(cat.isAlive());

        new Cat();
        new Cat();
        new Cat();
        new Cat();

        System.out.println(Cat.getCount());
    }
}
