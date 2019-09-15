package com.ilike.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 信息学院
 */
public class InfoCollageIterator implements Iterator {

    /**
     * 这里我们需要知道Department是以怎样的方式进行迭代的
     */
    List<Department> departments;
    /**
     * 遍历的位置
     */
    int index=-1;

    public InfoCollageIterator(List<Department> departments) {
        this.departments = departments;
    }

    /**
     * 判断是否换有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index>=departments.size()-1){
            return false;
        }else{
            index+=1;
            return true;
        }

    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
