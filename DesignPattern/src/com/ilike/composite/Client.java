package com.ilike.composite;

public class Client {

    public static void main(String[] args) {
        //从大到小创建
        OrganizationComponent university = new University("清华大学","中国顶级名校");
        //创建学院
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("建筑学院", "建筑学院");
        university.add(college1);
        university.add(college2);
        //创建各学院下的专业
        OrganizationComponent department1 = new Department("软件工程", "软件工程");
        OrganizationComponent department2 = new Department("网络工程", "网络工程");
        OrganizationComponent department3 = new Department("计算机工程与技术", "计算机工程与技术");
        college1.add(department1);
        college1.add(department2);
        college1.add(department3);
        OrganizationComponent department4 = new Department("建筑学", "建筑学");
        OrganizationComponent department5 = new Department("土木工程", "土木工程");
        OrganizationComponent department6 = new Department("水利工程", "水利工程");
        college2.add(department4);
        college2.add(department5);
        college2.add(department6);

        college2.print();
    }
}
