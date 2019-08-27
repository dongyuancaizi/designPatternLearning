package com.ilike.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends OrganizationComponent {
    /**
     * 学院
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("............."+this.getName()+"..................");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent: organizationComponents ) {
            organizationComponent.print();
        }

    }
}
