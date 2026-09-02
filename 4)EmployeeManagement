package info.java;

class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void performanceReport() {
        System.out.println("Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Performance: Good");
    }

    public void manageProjects() {
        System.out.println(name + " manages company projects.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    public void manageProjects() {
        System.out.println(getName() + " manages multiple projects.");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    public void manageProjects() {
        System.out.println(getName() + " develops and manages software projects.");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public double calculateBonus() {
        return getSalary() * 0.12;
    }

    public void manageProjects() {
        System.out.println(getName() + " works on programming projects.");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", "Mumbai", 60000);
        Developer d = new Developer("Amit", "Pune", 50000);
        Programmer p = new Programmer("Rohan", "Nashik", 40000);

        System.out.println("----- MANAGER -----");
        m.display();
        m.performanceReport();
        m.manageProjects();

        System.out.println("\n----- DEVELOPER -----");
        d.display();
        d.performanceReport();
        d.manageProjects();

        System.out.println("\n----- PROGRAMMER -----");
        p.display();
        p.performanceReport();
        p.manageProjects();
    }
}

