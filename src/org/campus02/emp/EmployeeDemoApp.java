package org.campus02.emp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeDemoApp {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Jane", 1000, "Kueche");
        Employee e2 = new Employee(2, "Max", 2000, "Buero");
        Employee e3 = new Employee(3, "Peter", 3000, "Buero2");

        EmployeeManager em = new EmployeeManager();
        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(e3);

        Employee found = em.findByEmpNumber(2);
        System.out.println("found = " + found);
        Employee notfound = em.findByEmpNumber(4);
        System.out.println("notfound = " + notfound);

        ArrayList<Employee> inKueche = em.findByDepartment("Kueche");
        System.out.println("inKueche = " + inKueche);
        ArrayList<Employee> notInKueche = em.findByDepartment("Finance");
        System.out.println("notInKueche = " + notInKueche);

        Employee e4 = new Employee(3,"Peter", 3000, "Buero2");
        System.out.println("e3 == e4 " + e3.equals(e4));



    }
}
