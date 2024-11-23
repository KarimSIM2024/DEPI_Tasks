package Payment_Processing_System;

abstract class Payment {
    protected double amount;
    protected String transactionId;

    public Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }
    public abstract void processPayment();

    public void showPaymentDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
    }
}