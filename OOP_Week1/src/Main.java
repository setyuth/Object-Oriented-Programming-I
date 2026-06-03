// Main.java
// This is where we CREATE objects from the Student blueprint and USE them

public class Main {

    public static void main(String[] args) {

        // Create Object 1 — a specific Student
        Student s1 = new Student();   // 'new' builds an actual object in memory
        s1.name  = "Sokha";
        s1.age   = 20;
        s1.major = "Computer Science";

        // Create Object 2 — a different Student, completely independent
        Student s2 = new Student();
        s2.name  = "Dara";
        s2.age   = 22;
        s2.major = "Engineering";

        // Ask each object to introduce itself
        s1.introduce();
        s2.introduce();

        // Key observation: both objects use the SAME class (blueprint)
        // but each has its own independent data
        System.out.println("Both students came from ONE blueprint: the Student class");
    }
}