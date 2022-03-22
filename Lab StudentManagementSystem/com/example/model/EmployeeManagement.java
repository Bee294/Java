package com.example.model;
//try{}catch(Exception e) loi run time.
//de phong co the xay ra.

import com.example.entity.Employee;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomerException extends Exception {

    private static final long seriaVersionUID = 1L;

    public CustomerException(String str) throws CustomerException {
        super();//class constructor parent class
        System.out.println(str);
        EmployeeManagement.operations();
    }
}

public class EmployeeManagement {

    //Collection
    //Key: Value
    //Chua du lieu sinh vien
    public static Map<Integer, Employee> map = new HashMap<Integer, Employee>();


    public static void addEmployee(String name, int age, int id) throws CustomerException {
        Employee emp = new Employee(name, age, id);
        map.put(id, emp);
        operations();

    }

    public static void deleteEmployee(int empId) throws CustomerException {
        if (map.containsKey(empId)) {//kiem tra trong "Key" xem co ton tai empId
            map.remove(empId);
            System.out.println("Successfully Deleted from the List !!");
        } else {
            throw new CustomerException("Not Found Exception");
        }
        operations();
    }

    public static void searchEmployee(int empId) throws CustomerException, NullPointerException {
        if (map.containsKey(empId)) {//kiem tra trong "Key" xem co ton tai empId
            System.out.println("Employee details: " + map.get(empId));
        } else {
            throw new CustomerException("Not Found Exception");
        }
        operations();
    }

    public static void employeeList() {
        System.out.println(map.toString());

    }

    public static void operations() throws CustomerException {
        System.out.println("\n******* Employee management system ******");
        System.out.println("1. Add employee");
        System.out.println("2. Delete employee");
        System.out.println("3. Search employee");
        System.out.println("4. List all");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Enter employee details(Name, age, id)");
            Scanner scanner1 = new Scanner(System.in);

            String name = scanner1.next();
            int age = scanner1.nextInt();
            int id = scanner1.nextInt();

            if (!name.equals("") && age != 00 && id != 0){
                addEmployee(name,age, id);
            }

        } else if (userInput == 2) {
            System.out.println("Enter employee id: ");
            Scanner scanner2 = new Scanner(System.in);

            int empId = scanner2.nextInt();
            try {
                deleteEmployee(empId);
            } catch (CustomerException e) {
                System.out.println(e);
            }


        } else if (userInput == 3) {
            System.out.println("Enter employee id: ");
            Scanner scanner3 = new Scanner(System.in);

            int empId = scanner3.nextInt();
            try {
                searchEmployee(empId);
            } catch (CustomerException e) {
                System.out.println(e);
            }
            operations();

        } else if (userInput == 4) {
            employeeList();

            operations();
        }

    }

    public static void main(String[] args) throws CustomerException {
        operations();
    }


}
