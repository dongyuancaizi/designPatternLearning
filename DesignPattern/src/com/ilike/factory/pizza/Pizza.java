package com.ilike.factory.pizza;

public abstract class Pizza {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 名字
     */
    private String name;
    /**
     * 准备原材料，不同的披萨，不一样，应该我们做成抽象方法
     */
  public abstract void prepare();

    /**
     * 烘烤
     */
  public   void bake(){
      System.out.println(name+"   baking");
  }

    /**
     * 切分
     */
    public   void cut(){
        System.out.println(name+"   cuting");
    }

    /**
     * 打包
     */
    public  void box(){
        System.out.println(name+"   boxing");
    }
}
