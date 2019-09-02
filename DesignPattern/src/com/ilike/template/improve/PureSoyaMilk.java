package com.ilike.template.improve;

/**
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("加入上好的花生");
    }

    @Override
    public boolean hasCondiments() {
        return false;
    }
}
