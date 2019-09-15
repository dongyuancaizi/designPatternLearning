package com.ilike.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息学院
 */
public class InfoCollage implements College{

    List<Department> departments;

    public InfoCollage(List<Department> departments) {
        this.departments = departments;
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");
        addDepartment("服务器安全","服务器安全");
    }
    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollageIterator(departments);
    }
}
