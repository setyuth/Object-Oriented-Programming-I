// PARENT — defines the default version of introduce()
public class Person {
    protected String name;
    protected int    age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + " (age " + age + ")");
    }

    public String getRole() {
        return "Person";
    }
}

