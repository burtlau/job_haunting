package chap6;

public class Employee implements Comparable<Employee>, Cloneable{
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercentage) {
        double raise = salary * byPercentage / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + " ,salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.getSalary());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        return cloned;
    }
}
