package Payment_Processing_System;

public class MainTask {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(150.50, "TXN12345", "1234-5678-9876-5432", "Wael Balbaa");
        Payment paypalPayment = new PayPalPayment(100 , "TXN67890", "kareemzwael@gmail.com");

        creditCardPayment.showPaymentDetails();
        creditCardPayment.processPayment();

        paypalPayment.showPaymentDetails();
        paypalPayment.processPayment();
    }
}
