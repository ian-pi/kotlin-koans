package i_introduction._6_Data_Classes;

import com.google.common.collect.Lists;
import util.JavaCode;

import java.util.List;

public class JavaCode6 extends JavaCode {

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person(" +
                    "name=" + name +
                    ", age=" + age +
                    ')';
        }
    }

    public static List<JavaCode6.Person> task6() {
        return Lists.newArrayList(new Person("Alice", 29), new Person("Bob", 31));
    }

    public static List<i_introduction._6_Data_Classes.Person> task6Interop() {
        i_introduction._6_Data_Classes.Person alice = new i_introduction._6_Data_Classes.Person("Alice", 29);


        i_introduction._6_Data_Classes.Person bob = new i_introduction._6_Data_Classes.Person();

        // kotlin (data) classes come with getters and setters
        bob.getAge();
        bob.setAge(32);
        // no setter available because name is immutable!
        bob.getName();
        return Lists.newArrayList(alice, bob);
    }
}
