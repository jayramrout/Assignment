package _06_Inheritance;

public class Person {
    private String name;

    public Person() {
        name = "No name yet.";
    }

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void print() {
        System.out.println("Name: " + name);
    }

    public boolean equals(Person p) {
        return name.equals(p.name);
    }
}