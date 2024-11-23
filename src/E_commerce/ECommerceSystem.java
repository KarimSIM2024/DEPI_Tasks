package E_commerce;


public class ECommerceSystem {
    public static void main(String[] args) {
        User[] users = {
                new Customer("Alice", "alice@example.com", "123 Main St"),
                new Admin("admin", "admin@example.com", "Super Admin"),
                new Customer("Ahmed", "Ahmed@example.com", "456 super Rd"),
                new Admin("Karim", "Karim@example.com", "Moderator")
        };

        for (User user : users) {
            user.displayInfo();
            if (user instanceof Customer) {
                System.out.println("This user is a Customer.");
            } else if (user instanceof Admin) {
                System.out.println("This user is an Admin.");
            }
            System.out.println("-----------------------");
        }
    }
}
