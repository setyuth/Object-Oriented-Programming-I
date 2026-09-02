public class Battery {
    private int capacityKwh;

    public Battery(int capacityKwh) {
        this.capacityKwh = capacityKwh;
    }

    public void charge() {
        System.out.println("Battery (" + capacityKwh + " kWh) is charging");
    }
}