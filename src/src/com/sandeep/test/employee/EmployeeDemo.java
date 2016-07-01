package com.sandeep.test.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by smalik3 on 6/20/16
 */
public class EmployeeDemo {

    /*
     1. who is the boss?
     2. What is the maximum salary?
     3. What is minimum salary?
     4. What is age range?
     5. Which manager has maximum employees?
     */

    public static void main(String[] args) throws IOException {
        final InputStream is = EmployeeDemo.class.getClassLoader().getResourceAsStream("employees.csv");
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Employee> employeeList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            Employee employee = new Employee();
            employee.setName(parts[0]);
            int age = Integer.parseInt(parts[1]);
            employee.setAge(age);
            double salary = Double.parseDouble(parts[2]);
            employee.setSalary(salary);
            employee.setManager(parts[3]);
            employeeList.add(employee);
        }

        System.out.println(employeeList);

        String boss = findBoss(employeeList);
        System.out.println("Boss is " + boss);

        double maxSalary = findMaxSalary(employeeList);
        System.out.println("Max salary is " + maxSalary);

        double minSalary = findMinSalary(employeeList);
        System.out.println("Min salary is " + minSalary);

        String maxEmployeeManger = findManagerWithMaxEmployees(employeeList);
        System.out.println("Manager with maximum employees is " + maxEmployeeManger);

    }

    private static String findManagerWithMaxEmployees(List<Employee> employees) {
        Map<String, Integer> map = new HashMap<>();
        for (Employee employee : employees) {
            if (!map.containsKey(employee.getManager()))
                map.put(employee.getManager(), 0);
            map.put(employee.getManager(), map.get(employee.getManager()) + 1);
        }
        int max = 0;
        String managerName = null;
        for (String name : map.keySet()) {
            if(map.get(name) > max) {
                max = map.get(name);
                managerName = name;
            }
        }
        return managerName;
    }

    public static String findBoss(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.getManager() == null || employee.getManager().equals(" ")) {
                return employee.getName();
            }
        }
        return null;
    }

    public static double findMaxSalary(List<Employee> employees) {
        // approach1:
        Map<Double, Employee> map = new TreeMap<>();
        for (Employee employee : employees) {
            map.put(employee.getSalary(), employee);
        }
        final Set<Double> salaries = map.keySet();
        final Object[] objects = salaries.toArray();
        return (Double) objects[objects.length - 1];
    }

    public static double findMinSalary(List<Employee> employees) {
        // approach1:
        Map<Double, Employee> map = new TreeMap<>();
        for (Employee employee : employees) {
            map.put(employee.getSalary(), employee);
        }
        final Set<Double> salaries = map.keySet();
        final Object[] objects = salaries.toArray();
        return (Double) objects[0];
    }

}
