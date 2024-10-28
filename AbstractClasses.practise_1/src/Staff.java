public abstract class Staff implements Employee {

    private int salary;

    public Staff(int salary){
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
