package com.ilike.observer;

/**
 * 观察者接口，由具体的观察者来实现
 */
public interface Observer {
    /**
     *  更新天气情况的接口
     * @param temperature  气温
     * @param pressure     气压
     * @param humidity     湿度
     */
    void update(float temperature,float pressure,float humidity);
}
