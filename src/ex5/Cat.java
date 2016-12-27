package ex5;

//Инкапсуляция
public class Cat { //JavaBean
    private int age;
    private int weight;
    private String name;
    private boolean sex;
    private boolean isAlive;
    private static int count;

    public void setAge(int age) {
        if (age <= 20) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    Cat() {
        count++;
    }
}
