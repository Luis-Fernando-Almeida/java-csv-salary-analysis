package application;

import entities.Employee;
import services.EmployeeSumCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            Comparator<String> comp = Comparator.naturalOrder();

            List<String> salaries = list.stream()
                    .filter(employee -> employee.getSalary() >= salary)
                    .map(Employee::getEmail)
                    .sorted(comp).toList();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            salaries.forEach(System.out::println);

            EmployeeSumCalculator empserv = new EmployeeSumCalculator();
            System.out.print("Enter the first letter of a name: ");
            String initial = sc.next().toUpperCase();

            double sum = empserv.filteredSum(list, employee -> Character.toUpperCase(employee.getName().charAt(0)) == initial.charAt(0));

            if (sum == 0.0) {
                System.out.println("No employees found with a name starting with the letter '" + initial + "'");
            } else {
                System.out.println("Total salary of employees with names starting with '" + initial + "': " + sum);
            }

            //double sum = empserv.filteredSum(list, employee -> employee.getName().charAt(0) == 'M');
            //System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
