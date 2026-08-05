public class main {
    static void main() {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6)
        };

        for (Shape s : shapes) {
            s.describe();                 // shared behavior — same for all
            System.out.println(s.area()); // abstract behavior — each own formula
        }
    }
}
