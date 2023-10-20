package com.ProxyPattern;

public class proxyPattern {

    public static void main(String[] args) {

        employeeDao e = new employeeProxy(new employeImpl(), "ADMIN");

        employeeDao e1 = new employeeProxy(new employeImpl(), "USER");

        employeeDao e2 = new employeeProxy(new employeImpl(), "OTHER");
        Employee emp = new Employee();

        e.create(emp);
        e1.create(emp);
        e2.create(emp);
        System.out.println("*********");
        e.delete(emp);
        e1.delete(emp);
        e2.delete(emp);
        System.out.println("*********");
        System.out.println(e.getData(1));
        e1.getData(2);
        e2.getData(3);

        //proxy pattern is used in many cases

        //proxy pattern has a concrete Impl and is a Interface Impl

        // Access Control like depicted here
        // Caching control like if data is already present avoid calling real object
        // Preprocessing and Postprocessing before and after making request

        // You can also use multiple proxies together
        //Client -> Proxy1 -> Proxy2 -> Proxy3 -> Real Object
    }
}
