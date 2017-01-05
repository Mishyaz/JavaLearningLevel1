package ex12Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main extends Person {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
//        List<Person> persons = new CopyOnWriteArrayList<Person>();
        Person tomPerson = new Person();
        tomPerson.age = 30;
        tomPerson.name = "Tom";
        persons.add(tomPerson);
        persons.add(new Person("Jerry", 20));
        persons.add(new Person("Mary", 10));
        persons.add(new Person("Adam", 10));

//        for (Person person : persons) { //так нельзя, работает только в CopyOnWriteArrayList
//            if (person == tomPerson) {
//                persons.remove(person); //проверять и менять недопустимо
//            }
//        }

//        for (Person person : new ArrayList<Person>(persons)) {
//            if (person == tomPerson) {
//                persons.remove(person);
//            }
//        }

        //itco - создание итератора
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
//            Person person = iterator.getNextElement();
            Person person = iterator.next();

            if (person == tomPerson) {
//                persons.remove(person);
                iterator.remove();
            }
        }

        for (Person person : persons) {
            System.out.println(person.name + " " + person.age);
        }
    }
}
