package com.ilike.iterator;

import java.util.Iterator;

/**
 * 计算机学院
 */
public class ComputerCollage  implements College{

    Department [] departments;

    public ComputerCollage(Department[] departments) {
        this.departments = departments;
        addDepartment("java","java");
        addDepartment("PHP","PHP");
        addDepartment("大数据","大数据");
        addDepartment("物联网","物联网");
    }

    /**
     * 当前数组的对象个数
     */
    int numOfDepartment;
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[numOfDepartment]=department;
        numOfDepartment+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollageIterator(departments);
    }
}
