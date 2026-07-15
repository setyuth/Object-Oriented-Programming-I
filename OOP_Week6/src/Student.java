// CHILD class — inherits everything from Person, adds its own things
public class Student extends Person {        // "extends" = IS-A relationship
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);    // "trigger the parent's setup first"
        this.major = major;  // then add my own unique setup
    }

    // Student's OWN unique action — not in Person
    public void study() {
        System.out.println(name + " is studying " + major);
        // name is accessible because it is "protected" in Person
    }
}
