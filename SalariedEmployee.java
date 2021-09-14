public class SalariedEmployee extends Employee{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int payment() {
        return 0;
    }
}
