// Given a list of objects of following class: class Employee{ String fullName; Long salary; String city; } Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi. Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class FlatMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aman Pal", 4000L, "delhi"),
                new Employee("Sahil Singh", 3000L, "ghaziabad"),
                new Employee("Akash Kumar", 6000L, "delhi"),
                new Employee("Manish Yadav", 4000L, "delhi"),
                new Employee("Akshay Saini", 4500L, "mumbai")
        );

        List<String> unique = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique first names: " + unique);
    }
}
