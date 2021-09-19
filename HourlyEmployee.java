public class HourtlyEmployee extends Employee{
    private int hoursWorked;
    private int hourlyPayment;

    public HourtlyEmployee(String name, String afm, int hoursWorked, int hourlyPayment) {
        super (name, afm);
        setHoursWorked(hoursWorked)
        setHourlyPayment(hourlyPayment)
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public int payment() {
        return this.hoursWorked * this.hourlyPayment;
    }
}
