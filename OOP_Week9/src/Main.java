public class Main {
    static void main() {
        Person[] people = {
                new Student("Sokha", 20, "CS"),
                new Teacher("Syuth", 30, "OOP"),
                new Person("Chan",   45)
        };

        for (Person p : people) {     // "p" has the LABEL Person (compile-time type)
            p.introduce();             // the ACTUAL object (run-time type) decides the output
        }
    }
}
