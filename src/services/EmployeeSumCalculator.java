package services;

import entities.Employee;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeSumCalculator {
    public double filteredSum(List<Employee> list, Predicate<Employee> criteria){
        double sum = 0.0;
        for (Employee emp : list){
            if (criteria.test(emp)){
                sum += emp.getSalary();
            }
        }
        return sum;
    }
}
