package com.ilike.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 计算机学院
 */
public class ComputerCollageIterator implements Iterator {

    /**
     * 这里我们需要知道Department是以怎样的方式进行迭代的
     */
    Department [] departments;
    /**
     * 遍历的位置
     */
    int position=0;

    public ComputerCollageIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否换有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position>=departments.length||departments[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;
        return department;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
