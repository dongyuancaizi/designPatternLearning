package com.ilike.flyweight;

/**
 * 具体的网站
 */
public class ConcreteWebSite extends WebSite {


    /**
     * 网站发布形式(共享部分，内部状态)
     */
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User  user) {
        System.out.println("网站的发布形式为:"+type+",用户:"+user.getName());
    }
}
