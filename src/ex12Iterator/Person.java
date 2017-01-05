package ex12Iterator;

import java.util.Date;

public class Person implements Comparable<Person>{
    String name;
    int age;
    String contacts;
    Date birthday;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age == o.age) {
            return name.compareTo(o.name);
        }
        return age - o.age;
//        return name.length() - o.name.length();
//        return name.compareTo(o.name);
    }
}
