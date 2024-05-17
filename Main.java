import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Anna Kowalska", 4100.0, 1, "2022-08-14", "Worker");
        Worker worker2 = new Worker("Michał Nowak", 4500.0, 2, "2021-12-05", "Worker");
        Worker worker3 = new Worker("Katarzyna Wiśniewska", 4400.0, 3, "2023-04-28", "Worker");
        Worker worker4 = new Worker("Piotr Zieliński", 4400.0, 4, "2022-11-20", "Worker");
        Manager manager = new Manager("Joanna Kamińska", 7000.0, 5, "2021-10-03", "Manager");
        Employee[] employees = { worker1, worker2, worker3, worker4, manager };

        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.getId() + ", Position: " +
                    employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " +
                    employee.getSalary() + ")");
        }
    }
}