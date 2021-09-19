public class SalariedEmployee extends Employee{
    private int salary;

    public SalariedEmployee(String name, String afm, int salary) {
        super (name, afm);
        setSalary(salary)
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int payment() {
        return this.salary;
    }
}
