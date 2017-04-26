package common;

import java.util.*;

/**
 *
 * @author jordanrehbein
 */
public class Startup {
    public static void main(String[] args) {
//        List<Employee> employeeList = new ArrayList<Employee>();
//        Employee e1 = new Employee("Martin", "Bob", "111-11-1111");
//        Employee e2 = new Employee("Miles", "Bill", "111-11-1112");
//        Employee e3 = new Employee("Frank", "Tom", "111-11-1113");
//        
//        employeeList.add((Employee)e1);
//        
//        employeeList.add((Employee)e2);
//        
//        employeeList.add((Employee)e3);
//        
//        for(Employee emp : employeeList){
//            System.out.println(emp.toString());
//        }

          List<Employee> employeeList = new ArrayList<Employee>();
        Employee e1 = new Employee("Martin", "Bob", "111-11-1111");
        Employee e2 = new Employee("Miles", "Bill", "111-11-1112");
        Employee e3 = new Employee("Frank", "Tom", "111-11-1113");
        
        employeeList.add(e1);
        
        employeeList.add(e2);
        
        employeeList.add(e3);
        
        for(Employee emp : employeeList){
            System.out.println(emp.toString());
        }
        
        Set<Dog> dogSet = new HashSet<Dog>();
        Dog d1 = new Dog("Martin", 11111);
        Dog d2 = new Dog("Miles", 11112);
        Dog d3 = new Dog("Frank", 11113);
        Dog d4 = new Dog("Frankie", 11113);
        
        dogSet.add((Dog)d1);
        
        dogSet.add((Dog)d2);
        
        dogSet.add((Dog)d3);
        
        dogSet.add((Dog)d4);
        
        ArrayList dogList = new ArrayList(dogSet);
        
        for(Object dog : dogList){
            System.out.println(dog.toString());
        }
    }
}
