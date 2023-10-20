package com.ProxyPattern;

public class Employee {
    public String name;
    Employee() {
        name = "rahul";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
