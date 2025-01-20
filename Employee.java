class Employee {
    private String Employed;
    private String Name;
    private String Department;

    public String getEmployed() {
        return Employed;
    }
    public void setEmployed(String employed) {
        Employed = employed;

    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name=name;}
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        this.Department = department;

    }
}

class Manager extends Employee {
    private double bonus;
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double calculateTotalSalary(double salary) {
        return salary+bonus;
    }
}