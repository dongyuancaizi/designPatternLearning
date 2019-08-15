package com.ilike.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 */
public class Demeter1 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

    }
}

/**
 * 学校总部员工
 */
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工
 */
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工管理类
 */
class CollegeManager{
    /**
     * 返回学院的所有员工
     * @return
     */
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            CollegeEmployee ce= new CollegeEmployee();
            ce.setId("学院员工的id="+i);
            list.add(ce);
        }
        return list;
    }

    public void printAllEmployee(){
        //获取学院员工
        List<CollegeEmployee> collegeEmployees = this.getAllEmployee();
        System.out.println("学院员工------------------------");
        collegeEmployees.forEach(s-> System.out.println("学院员工"+s.getId()));
    }
}

/**
 * 学校员工管理类
 */
class SchoolManager{
    /**
     * 返回学校总部的所有员工
     * @return
     */
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            Employee ce= new Employee();
            ce.setId("学校总部员工的id="+i);
            list.add(ce);
        }
        return list;
    }

    /**
     * 输出学校总部和学院员工信息
     * @param collegeManager
     */
    void printAllEmployee(CollegeManager collegeManager){
        //输出学院员工
        collegeManager.printAllEmployee();
        //获取学校总部员工
        List<Employee> allEmployee = this.getAllEmployee();
        System.out.println("学校总部员工------------------------");
        allEmployee.forEach(s-> System.out.println("学校总部员工"+s.getId()));

    }
}
