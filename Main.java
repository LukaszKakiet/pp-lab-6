import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Anna Kowalska", 4100.0, 1);
        Worker worker2 = new Worker("Michał Nowak", 4500.0, 2);
        Worker worker3 = new Worker("Katarzyna Wiśniewska", 4400.0, 3);
        Worker worker4 = new Worker("Piotr Zieliński", 4400.0, 4);
        Manager manager = new Manager("Joanna Kamińska", 7000.0, 5);
        Worker[] workers = {worker1, worker2, worker3, worker4};

        for (Worker worker : workers) {
            System.out.println("Salary: " + worker.getSalary());
            worker.work();
        }
        System.out.println("Salary: " + manager.getSalary());
        manager.work();
    }
}