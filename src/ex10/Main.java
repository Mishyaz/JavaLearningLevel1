package ex10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection collection;
        List<String> list; //упорядченный, допускаются дубликаты
        Set set; //неупорядоченный, дубликатов нет
//        Queue queue;
        Map<Integer, Character> map; //ключ -> значение

        list = new ArrayList<>(); //массив
//        list = new LinkedList<>();
        list.add("java");
        list.add("java");
        list.add("swing");
        list.add("javaFX");
//        list.add(10);

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.indexOf("swing"));
        System.out.println(list.lastIndexOf("java"));

//        list.remove(2);
//        list.remove("swing");
//
//        System.out.println(list);
        System.out.println("-----SET-----");

        set = new HashSet();
        set = new LinkedHashSet();
        set = new TreeSet();

        System.out.println(set.add("java"));
        System.out.println(set.add("java"));
        set.add("swing");
        set.add("javaFX");

        System.out.println(set);
        System.out.println("-----MAP-----");

        map = new HashMap<Integer, Character>();
        map.put(0, 'x');
        map.put(1, 'y');
        map.put(1, 'I');
        map.put(2, 'z');

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String, Person> mapname = new HashMap();
//        Map<String, Person> mapname = new LinkedHashMap<>();
        mapname.put("friend", new Person("Tommy", 10));
        mapname.put("vip", new Person("Nommy", 30));
        System.out.println(mapname.get("friend").name);

        for (Person person : mapname.values()) {
            System.out.println(person.name);
        }
        Map<Person, String> tagPerson = new HashMap<>();
        tagPerson.put(new Person("Tommy", 20), "friend");
        tagPerson.put(new Person("Nommy", 17), "friend");
        tagPerson.put(new Person("Ammy", 15), "friend");
        tagPerson.put(new Person("Nommy", 30), "vip");

        System.out.println(tagPerson);

        System.out.println(new HashSet<String>(tagPerson.values()));

        for (Map.Entry<Person, String> personStringEntry : tagPerson.entrySet()) {
            if (personStringEntry.getValue().equals("friend")) {
                System.out.println(personStringEntry.getKey().name);
            }
        }
    }
}
