public class TopManager extends Staff {

    private Company company;

    public TopManager(int salary, Company company) {
        super(salary);
        this.company = company;
    }

    @Override
    public double getMonthSalary() {

        double monthSalary = super.getMonthSalary();
        return company.getIncome() > 10_000_000 ? monthSalary + (monthSalary * 1.5) : monthSalary;
    }
}
