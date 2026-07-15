// ANOTHER CHILD — also inherits from Person
public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);    // same parent-first rule
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " teaches " + subject);
    }
}
