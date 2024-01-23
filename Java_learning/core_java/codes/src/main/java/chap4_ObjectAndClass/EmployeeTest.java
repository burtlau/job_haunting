package chap4_ObjectAndClass;

import java.time.*;

/**
 * try java doc: "option key" + "Enter"
 * @author bertlau
 * @version 1.0
 * @since version 1.0
 * @see <a href="www.google.com">The google search Engine.</a>
 */
public class EmployeeTest
{
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary() + " ,hireDay=" +
                    e.getHireDay());
    }
}
class Employee
{
    private String name;
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
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    /**
     * @return The name of the emloyee
     */
    public String getName()
    {
        return name;
    }

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

