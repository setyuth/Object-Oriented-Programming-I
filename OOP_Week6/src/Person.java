// PARENT class — defines what every Person has and can do
public class Person {
    protected String name;   // "family-accessible" — children can touch this directly
    protected int    age;

    // Parent's setup action — triggered first by all children
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    // Action every Person can do — shared by all children for free
    public void introduce() {
        System.out.println("Hi, I am " + name + ", age " + age);
    }
}

