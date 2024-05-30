public class Employee {
    private String name;
    private String lastName;
    private String surName;
    private int department;
    private double salary;
    public static int recount;
    private int id;

    public Employee(String lastName, String name, String surName, int department, double salary) {
        this.id = ++recount;
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getRecount() {
        return recount;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.lastName + " " + this.name + " " + this.surName + ",отдел " + this.department + ", Зарплата " + this.salary;
    }
}
