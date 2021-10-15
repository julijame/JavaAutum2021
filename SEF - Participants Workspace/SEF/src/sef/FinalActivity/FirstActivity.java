package sef.FinalActivity;

import java.util.*;

public class FirstActivity {
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList();

        emp.add(new Employee("Sarah", "Johnson", 23, "Manager", "Rimi", 2000));
        emp.add(new Employee("Peter", "Willson", 31, "Developer", "Maxima", 1300));
        emp.add(new Employee("Dawn", "Wilsson", 30, "Tester", "Maxima", 1800));
        emp.add(new Employee("Paul", "Davis", 45, "Director", "Rimi", 3000));

        // sort by salary
        Collections.sort(emp, Comparator.comparing(Employee::getSalary).reversed());

        for (Employee e: emp)
            System.out.println("I am " + e.getFirstName() + " and my salary is " + e.getSalary());
    }

}
