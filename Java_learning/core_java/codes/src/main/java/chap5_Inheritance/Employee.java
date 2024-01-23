package chap5_Inheritance;
import java.time.LocalDate;

public class Employee extends Person
{
    private double salary;
    private LocalDate hireDay;


    /**
     * @param n The name of the employee.
     * @param s The salary of the employee.
     * @param year The year of the hire date of the employee.
     * @param month The month of the hire date of the employee.
     * @param day The day of the hire date of the employee.
     */
    public Employee(String n, double s, int year, int month, int day)
    {
        super(n);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    /**
     * @return The name of the emloyee
     */

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


