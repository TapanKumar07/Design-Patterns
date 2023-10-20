package com.ProxyPattern;

public interface employeeDao {
    public void create(Employee e);
    public void delete(Employee e);
    public Employee getData(int Id);
}
