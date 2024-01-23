package chap4_ObjectAndClass;

public class StaticClass
{
    public static void main(String[] args) {
        StaticEmployee[] staff = new StaticEmployee[3];
        staff[0] = new StaticEmployee("Carl Cracker", 75000);
        staff[1] = new StaticEmployee("Harry Hacker", 50000);
        staff[2] = new StaticEmployee("Tony Tester", 40000);

        for (StaticEmployee e : staff)
        {
//            e.setId();
            System.out.println("name=" + e.getName() + " ,id=" + e.getId() + " ,salary=" + e.getSalary());
        }

        int n = StaticEmployee.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class StaticEmployee
{
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id = assignId();

    public StaticEmployee(String n, double s)
    {
        name = n;
        salary = s;
    }

    private static int assignId(){
        int i = nextId;
        nextId++;
        return i;
    }
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    };

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    };

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

