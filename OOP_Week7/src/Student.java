// CHILD — provides its OWN version (overrides)
public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // "I am declaring: I intentionally replace Person's introduce()"
    @Override
    public void introduce() {
        super.introduce();             // call parent's version first (EXTEND strategy)
        System.out.println("  I study " + major);   // then add my own part
    }

    // "I am declaring: I replace Person's getRole() with my own answer"
    @Override
    public String getRole() {
        return "Student";              // fully replaces — does NOT call super
    }
}
