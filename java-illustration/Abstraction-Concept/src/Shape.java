// ABSTRACT PARENT — cannot be built directly
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // REGULAR METHOD — shared, working behavior for every shape
    public void describe() {
        System.out.println("This shape is called: " + name);
    }

    // ABSTRACT METHOD — no body, every child MUST provide one
    public abstract double area();
}