public class Main {
    public static void main(String[] args) {
        //Write your code here
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 540006.96);
        Employee E2 = new Employee(101512032, "Tara", "Sharma", 612011.88);
        E1.printFullName();
        E1.printSalary();
        E2.printFullName();
        E2.printSalary();
    }
}

class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here
    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public void printFullName() {
        System.out.println("employee full name " + empFirstName + " " + empSecondName);
    }

    public void printSalary() {
        System.out.println("employee annual package " + empSalary);
    }
}