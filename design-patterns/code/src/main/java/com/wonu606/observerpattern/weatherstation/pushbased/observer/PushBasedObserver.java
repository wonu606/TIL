package com.wonu606.observerpattern.weatherstation.pushbased.observer;

public interface PushBasedObserver {

    public void update(float temperature, float humidity, float pressure);
}
