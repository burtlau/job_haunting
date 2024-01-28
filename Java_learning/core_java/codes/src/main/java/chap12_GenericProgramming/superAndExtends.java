//package chap12_GenericProgramming;
//
//import chap5_Inheritance.Employee;
//import chap5_Inheritance.Manager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class superAndExtends {
//    public static void main(String[] args) {
//
//        Manager ma = new Manager("a", 1000, 2000, 01, 01);
//        Manager mb = new Manager("b", 1000, 2000, 01, 01);
//        Employee ec = new Employee("c", 1000, 2000, 01, 01);
//        Employee ed = new Employee("d", 1000, 2000, 01, 01);
//        // Read-only collection that accepts instances of Employee or its subtypes
//        List<? super Employee> employeesA = new ArrayList<>();
//        employeesA.add(ma);
//        employeesA.add(ec);
//        Employee employee = employeesA.get(1);  // OK
//        Manager manager = employeesA.get(0);    // OK
//
//// Read-only collection that accepts instances of Manager or its subtypes
//        List<? extends Manager> managers = ...;
//        Manager manager = managers.get(0);     // OK
//        Employee employee = managers.get(1);   // Error: Cannot assign Manager to Employee
//
//// Write-only collection that accepts instances of Employee or its supertypes
//        List<? super Employee> employees = ...;
//        employees.add(new Employee());     // OK
//        employees.add(new Manager());      // OK
//        employees.add(new Object());       // Error: Cannot assign Object to Employee
//
//// Write-only collection that accepts instances of Manager or its supertypes
//        List<? super Manager> managersA = new ArrayList<>();
//        employeesA.add(ma);
//        employeesA.add(ec);
//        managers.add(new Manager());       // OK
//        managers.add(new Employee());      // Error: Cannot assign Employee to Manager
//
//    }
//}
