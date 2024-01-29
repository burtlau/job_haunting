package chap13_Collection;

import chap5_Inheritance.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee", 20000, 1900,1,1));
        staff.put("567-24-2546", new Employee("Harry Hacker", 20000, 1900,1,1));
        staff.put("157-62-7935", new Employee("Gary Cooper", 20000, 1900,1,1));
        staff.put("456-62-5527", new Employee("Francesca Cruz", 20000, 1900,1,1));

        System.out.println(staff);
        staff.remove("567-24-2546");
        staff.put("456-62-5527", new Employee("Francesca Miller", 20000, 1900,1,1));
        System.out.println(staff.get("157-52-7935"));

        for (Map.Entry<String, Employee> entry: staff.entrySet())
        {
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
    }
}
