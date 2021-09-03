public class MainEmployee {
    public static void main(String[] args){
        Employee employee1 = new Employee("Jane Doe", 23, 40000.00, Location.NEW_JERSEY);
        employee1.raiseSalary(5500.00);

        Employee employee2 = new Employee("Hiccup Haddock", 30, 55000.00, Location.NEW_YORK);

        System.out.println("Salary for " + employee1.name + " is " + "$"+employee1.salary);
        System.out.println("Salary for " + employee2.name + " is " + "$"+employee2.salary);
    }
}
