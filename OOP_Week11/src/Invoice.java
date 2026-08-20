// COMPLETELY UNRELATED CLASSES all implementing the same contract
public class Invoice implements Payable {
    private String invoiceId;

    public Invoice(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Invoice " + invoiceId + " paid: $" + amount);
    }
}