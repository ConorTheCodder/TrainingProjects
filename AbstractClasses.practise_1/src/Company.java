import java.util.*;

public class Company {
    private ArrayList<Employee> workers = new ArrayList<>();

    public void hire(Employee employee) {
        workers.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        workers.addAll(employees);
    }

    public void fire(Employee employee) {
        workers.remove(employee);
    }

    public double getIncome() {
        double income = 0.0;
        for (Employee worker : workers) {
            if (worker instanceof Manager) {
                double earning = ((Manager) worker).getCompanyEarnings();
                income += earning;
            }

        }
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count < 0) {
            return Collections.emptyList();
        }
        if (count > workers.size()) {
            count = workers.size();
        }
        Collections.sort(workers);
        Collections.reverse(workers);
        return workers.subList(0, count);
    }

    List<Employee> getLowestSalaryStaff(int count) {
        if (count < 0) {
            return Collections.emptyList();
        }
        if (count > workers.size()) {
            count = workers.size();
        }
        Collections.sort(workers);
        return workers.subList(0, count);
    }
}
