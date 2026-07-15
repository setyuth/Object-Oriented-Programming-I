// ANOTHER CHILD
public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();             // EXTEND — same structure
        System.out.println("  I teach " + subject);
    }

    @Override
    public String getRole() {
        return "Teacher";              // REPLACE — different result
    }
}
