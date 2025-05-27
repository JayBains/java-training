package Comparators;

public class Person implements Comparable<Person>{
    // implements the Comparable interface
    // must provide functionality of abstract classes in interface
    // Comparable interface has an abstract method called CompareTo()

    private String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age != other.age){
            return this.age - other.age;
        }
        return this.name.compareTo(other.name);
    }

}
