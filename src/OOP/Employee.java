package OOP;

public class Employee {
    String name;
    int age;
    double salary;
    Location location;

    Employee(String name, int age, double salary, Location location){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.location = location;
    }
    void raiseSalary(double amount) {
        this.salary += amount;
    }

}
