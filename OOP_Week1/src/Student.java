// Student.java
// This is a CLASS — a blueprint describing what every Student object will have

public class Student {

    // ATTRIBUTES — the data that every Student object holds
    // (We will make these private in Week 4 — for now, keep them simple)
    String name;
    int    age;
    String major;

    // BEHAVIORS — the actions a Student object can perform
    void introduce() {
        System.out.println("Hi! My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I study " + major);
        System.out.println("---");
    }
}