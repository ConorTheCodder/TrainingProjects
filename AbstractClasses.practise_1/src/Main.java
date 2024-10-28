import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Company company = new Company();
        List<Employee> employees = new ArrayList<>();


        for (int i = 0; i < 180; i++) {
            Operator operator = new Operator(new Random().nextInt(30_000, 50_000));
            company.hire(operator);
            employees.add(operator);
        }
        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager(new Random().nextInt(40_000, 60_000));
            company.hire(manager);
            employees.add(manager);

        }
        for (int i = 0; i < 10; i++) {
            TopManager topManager = new TopManager(new Random().nextInt(70_000, 130_000), company);
            company.hire(topManager);
            employees.add(topManager);

        }

        printStaffSalary(company);

        for (int i = 0; i < employees.size() / 2; i++) {
            company.fire(employees.get(i));
        }
        printStaffSalary(company);

    }

    public static void printStaffSalary(Company company) {

        List<Employee> topSalaryStaff = company.getTopSalaryStaff(13);
        for (Employee employee : topSalaryStaff) {
            System.out.println(employee.getMonthSalary());
        }

        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);

        for (Employee employee : lowestSalaryStaff) {
            System.out.println(employee.getMonthSalary());
        }

    }
}
