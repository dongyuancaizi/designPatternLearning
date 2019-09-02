package com.ilike.template;

/**
 * 抽象类，表示豆浆
 */
public abstract class SoyaMilk {
    /**
     * 模板方法make,不让子类继承
     */
    public final void make(){
      //选料
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    public void select(){
        System.out.println("第1步，选择新鲜的黄豆");
    }

    /**
     * 添加不同的配料
     */
    public abstract void addCondiments();

    /**
     * 浸泡
     */
    public void soak(){
        System.out.println("第3步，黄豆和配料开始浸泡3小时");
    }

    /**
     * 打奖
     */
    public void beat(){
        System.out.println("第4步，黄豆和配料放到豆浆机打碎");
    }
}
