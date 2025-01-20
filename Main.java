//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setEmployed("M04");
    manager.setName("Mehedi");
    manager.setDepartment("R&D");
    manager.setBonus(2000);
   double salary = manager.calculateTotalSalary(7000);
        System.out.println("Manager details: ");
        System.out.println("Name: " + manager.getName());
        System.out.println("Department: " + manager.getDepartment());
        System.out.println("ID: " + manager.getEmployed());
        System.out.println("Salary: " + salary);
    }
}