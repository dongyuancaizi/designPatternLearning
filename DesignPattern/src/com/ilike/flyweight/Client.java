package com.ilike.flyweight;

public class Client {

    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));
        //要一个以博客形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("jack"));

        System.out.println("网站的分类总数:"+factory.getWebSiteCount());
    }
}
