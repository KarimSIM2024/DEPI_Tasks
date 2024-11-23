package Online_Shopping_System;

class Electronics extends Product {
    int warrantyPeriod;

    public Electronics(String name, double price, int quantity, int warrantyPeriod) {
        super(name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    double calculateTotalPrice() {
        return price * quantity;
    }
}
