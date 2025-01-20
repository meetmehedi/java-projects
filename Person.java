 class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: "+" "+getName());
        System.out.println("Age: "+getAge());
    }
}
class Faculty extends Person{
    private String facultyId;
    private String department;

    public String getFacultyId() {
        return facultyId;
    }
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Faculty Id: "+getFacultyId());
        System.out.println("Department: "+getDepartment());
    }
}
class Professor extends Faculty{
    private String researchArea;
    public String getResearchArea() {
        return researchArea;
    }
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Research Area: "+getResearchArea());
    }
}
