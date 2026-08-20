public class Subscription implements Payable {
    private String plan;

    public Subscription(String plan) {
        this.plan = plan;
    }

    @Override
    public void pay(double amount) {
        System.out.println(plan + " subscription renewed for: $" + amount);
    }
}