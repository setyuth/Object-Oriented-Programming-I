public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println(name + "'s salary deposited: $" + amount);
    }
}