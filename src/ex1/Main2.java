package ex1;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Cat[] nayanCats = new Cat[15];
        Cat[] cats;
        cats = new Cat[3];
        new Cat();
        Cat cat = new Cat();
        cat.name = "tom";
        cats[0] = cat;
        cats[1] = new Cat();
        cats[2] = new Cat();

//        System.out.println(cats[0].name);

        for (int i = 0; i < cats.length; i++) {
            Cat cat1 = cats[i];
            System.out.println(cat1.name);
        }

        for (int i = 0; i < nayanCats.length; i++) {
            nayanCats[i] = new Cat();
            nayanCats[i].name = "Nayan " + i;
            nayanCats[i].ages = 1 + new Random().nextInt(10);
        }

        for (Cat nayanCat : nayanCats) {
            System.out.println("Cat name: " + nayanCat.name + ", age: " + nayanCat.ages );
        }
    }
}
