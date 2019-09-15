package com.ilike.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();
        ComputerCollage computerCollage = new ComputerCollage(new Department[4]);
        collegeList.add(computerCollage);
        InfoCollage infoCollage = new InfoCollage(new ArrayList<>());
        collegeList.add(infoCollage);
        OutputImpl output=new OutputImpl(collegeList);
        output.printCollege();
    }
}
