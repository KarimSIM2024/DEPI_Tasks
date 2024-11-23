package Online_Shopping_System;

class Clothing extends Product {
    String size;
    String material;

    public Clothing(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }

    @Override
    double calculateTotalPrice() {
        double totalPrice = price * quantity;
        if (quantity > 5) {
            totalPrice *= 0.9; // 10% discount
        }
        return totalPrice;
    }
}
