package ex6;

public class Fox extends Animal {
    @Override //переопределение
    void voice() {
        System.out.println("What does fox say?");
    }

    void voice(int a) { //перегрузка
        for (int i = 0; i < a; i++) {
            voice();
        }
    }
}
