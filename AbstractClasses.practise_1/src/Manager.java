import java.util.Random;

public class Manager extends Staff {


    private int companyEarnings = new Random().nextInt(115_000, 140_000);

    public Manager(int salary) {
        super(salary);
    }

    public int getCompanyEarnings() {
        return companyEarnings;
    }

    @Override
    public double getMonthSalary() {
        return super.getMonthSalary() + (companyEarnings * 0.05);
    }

}
