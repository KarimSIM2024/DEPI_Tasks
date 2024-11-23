package E_commerce;

class Admin extends User {
    private String adminLevel;

    public Admin(String username, String email, String adminLevel) {
        super(username, email);
        this.adminLevel = adminLevel;
    }

    public String getRole() {
        return "Admin";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin Level: " + adminLevel);
        System.out.println();
    }
}
