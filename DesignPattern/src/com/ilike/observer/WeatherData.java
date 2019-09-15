package com.ilike.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站
 */
public class WeatherData implements Subject {

    private List<Observer> observers1;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 所有的接入方，观察者集合
     */
    private List<Observer> observers=new ArrayList<>();
    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }


    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObserver();
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(s->s.update(temperature,pressure,humidity));
    }
}
