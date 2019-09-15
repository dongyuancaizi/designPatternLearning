package com.ilike.iterator;

/**
 * 院系
 */
public class Department {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String des;

    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }

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
}
