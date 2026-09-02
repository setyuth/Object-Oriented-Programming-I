// THE WHOLE — HAS-A Engine, HAS-A Battery
public class Car {
    private String model;
    private Engine  engine;    // HAS-A Engine — a field of another class
    private Battery battery;   // HAS-A Battery — a second field

    public Car(String model, int horsepower, int capacityKwh) {
        this.model  = model;
        this.engine  = new Engine(horsepower);   // built when the Car is built
        this.battery = new Battery(capacityKwh);
    }

    public void start() {
        System.out.println(model + " is starting...");
        engine.start();     // DELEGATION — Car asks its Engine to do the work
    }

    public void chargeBattery() {
        battery.charge();   // DELEGATION — Car asks its Battery to do the work
    }
}