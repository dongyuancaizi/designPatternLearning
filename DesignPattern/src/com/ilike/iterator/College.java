package com.ilike.iterator;

import java.util.Iterator;

/**
 * 大学
 */
public interface College {

     String getName();

    /**
     * 增加系
     * @param name
     * @param des
     */
    void addDepartment(String name,String des);

    Iterator createIterator();
}
