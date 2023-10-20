package com.ProxyPattern;

public class employeImpl implements employeeDao{
    @Override
    public void create(Employee e) {
        System.out.println("Employee created");
    }

    @Override
    public void delete(Employee e) {
        System.out.println("Employee Deleted");
    }

    @Override
    public Employee getData(int Id) {
        return new Employee();
    }
}
