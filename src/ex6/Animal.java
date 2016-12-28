package ex6;

public class Animal {
    String name;
    int age;
    int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void about() {
        System.out.printf("%s, %d, %d", name, age, weight);
    }

    void voice() {
        System.out.println("Agrrrr!");
    }
}
