package org.campus02.emp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeManager {

   private ArrayList<Employee> employees = new ArrayList<>();

   public void addEmployee(Employee e){

       if(employees.contains(e)){
           System.out.println("Person schon vorhanden!");
       } else {
           employees.add(e);
       }
   }

   public Employee findByEmpNumber(int number){
       for(Employee e : employees){
           if(e.getEmpNumber() == number)
               return e;
       }
       return null;
   }

   public ArrayList<Employee> findByDepartment(String department){
       ArrayList<Employee> result = new ArrayList<>();
       for(Employee e : employees) {
           if (e.getDepartment().equals(department)) {
               result.add(e);
           }
       }
        return result;
   }
}
