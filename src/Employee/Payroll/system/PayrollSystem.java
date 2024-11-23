package Employee.Payroll.system;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Ahmed", 101, 5000, 1000),
                new PartTimeEmployee("Mahmoud", 102, 20, 120),
                new FullTimeEmployee("Mohamed", 103, 6000, 1500),
                new PartTimeEmployee("Karim", 104, 25, 100)
        };

        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
            System.out.println("Calculated Salary: $" + emp.calculateSalary());
            if (emp instanceof FullTimeEmployee) {
                System.out.println("This employee is Full-Time.");
            } else if (emp instanceof PartTimeEmployee) {
                System.out.println("This employee is Part-Time.");
            }
            System.out.println("-----------------------");
        }
    }
}
