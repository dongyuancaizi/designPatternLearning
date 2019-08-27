package com.ilike.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 专业
 */
public class Department extends OrganizationComponent {


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("............."+this.getName()+"..................");
    }
}
