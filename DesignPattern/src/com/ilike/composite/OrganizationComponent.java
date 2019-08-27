package com.ilike.composite;

/**
 * 组织抽象类
 */
public abstract class OrganizationComponent {
    /**
     * 名字
     */
    private String name;
    /**
     * 说明
     */
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        new UnsupportedOperationException();
    }


    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        new UnsupportedOperationException();
    }

    public abstract void print();
}
