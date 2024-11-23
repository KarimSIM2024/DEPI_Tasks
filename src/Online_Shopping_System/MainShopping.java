package Online_Shopping_System;

public class MainShopping {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("MacBook Air M1", 22000, 1, 24);
        Clothing shirt = new Clothing("Holister", 1100, 3, "XL", "Cotton");

        laptop.showProductDetails();
        System.out.println("Total Price: " + laptop.calculateTotalPrice());
        System.out.println();

        shirt.showProductDetails();
        System.out.println("Total Price: " + shirt.calculateTotalPrice());
    }
}

