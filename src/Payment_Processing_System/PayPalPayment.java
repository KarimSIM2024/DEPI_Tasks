package Payment_Processing_System;

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String transactionId, String email) {
        super(amount, transactionId);
        this.email = email;
    }

    public void processPayment() {
        System.out.println("Processing PayPal payment for " + email);
    }
}
