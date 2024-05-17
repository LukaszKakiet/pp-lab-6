import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Anna Kowalska", 4100.0, 1, "2021-01-10", "Worker");
        Worker worker2 = new Worker("Michał Nowak", 4500.0, 2, "2021-02-15", "Worker");
        Worker worker3 = new Worker("Katarzyna Wiśniewska", 4400.0, 1, "2021-03-20", "Worker");
        Manager manager = new Manager("Joanna Kamińska", 7000.0, 5, "2020-01-05", "Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker1.getName() + " equals " + worker2.getName() + " : " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals " + worker3.getName() + " : " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " equals " + manager.getName() + " : " + worker1.equals(manager));
    }
}