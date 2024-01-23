package chap6;

public class CloneTest {
    public static void main(String[] args) {
        try
        {
            Employee original = new Employee("Jonny Q.Public", 50000);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
