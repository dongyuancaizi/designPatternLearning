package com.ilike.observer;

public class Client {

    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        //创建观察者
        CurrentCondition currentCondition = new CurrentCondition();
        BaiduSite baiduSite = new BaiduSite();
        //注册到weatherData中
        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(baiduSite);
        //测试
        //通知各个注册的观察者，看看信息
        weatherData.setData(10f,100f,30.3f);

        System.out.println("------------------------------");
        weatherData.removeObserver(currentCondition);
        weatherData.setData(10f,100f,30.3f);
    }
}
