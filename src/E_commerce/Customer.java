package E_commerce;

class Customer extends User {
    private String address;

    public Customer(String username, String email, String address) {
        super(username, email);
        this.address = address;
    }

    public String getRole() {
        return "Customer";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Address: " + address);
        System.out.println();
    }
}
