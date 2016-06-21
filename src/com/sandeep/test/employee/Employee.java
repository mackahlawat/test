package com.sandeep.test.employee;

/**
 * Created by smalik3 on 6/20/16
 */
public class Employee {

    private String name;
    private double salary;
    private int age;
    private String manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{name=" + name + ", age=" + age + ", salary=" + salary + ", manager=" + manager + "}";
    }
}
