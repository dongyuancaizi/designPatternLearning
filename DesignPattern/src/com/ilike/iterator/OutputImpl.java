package com.ilike.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {


    //学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //输出  ，输出学院
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = (College) iterator.next();
            System.out.println("========="+college.getName()+"=========");
            printDepartment(college.createIterator());

        }
    }


    //输出 ，学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
