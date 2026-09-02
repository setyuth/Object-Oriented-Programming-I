// THE PART — a complete, independent class
public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine (" + horsepower + " hp) roars to life");
    }
}