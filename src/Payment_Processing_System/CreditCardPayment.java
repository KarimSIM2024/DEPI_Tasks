package Payment_Processing_System;

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(double amount, String transactionId, String cardNumber, String cardHolderName) {
        super(amount, transactionId);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void processPayment() {
        System.out.println("Processing credit card payment for " + cardHolderName);
    }
}
