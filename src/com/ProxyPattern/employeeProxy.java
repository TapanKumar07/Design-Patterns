package com.ProxyPattern;

public class employeeProxy implements employeeDao{

    private employeImpl impl;
    private String role;

    public employeeProxy(employeImpl imp, String rle) {
        impl = imp;
        role = rle;
    }
    @Override
    public void create(Employee e) {
        if(role == "ADMIN")
            impl.create(e);
        else
            System.out.println("Access Denied");
    }

    @Override
    public void delete(Employee e) {
        if(role == "ADMIN")
            impl.delete(e);
        else
          System.out.println("Access Denied");
    }

    @Override
    public Employee getData(int Id) {
        if(role == "ADMIN" || role == "USER")
            return impl.getData(Id);
        return null;
    }
}
