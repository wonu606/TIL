package com.wonu606.observerpattern.weatherstation.pushbased.subject;

import com.wonu606.observerpattern.weatherstation.pushbased.observer.PushBasedObserver;
import java.util.ArrayList;
import java.util.List;

public class PushBasedWeatherData implements PushBasedSubject {

    private List<PushBasedObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public PushBasedWeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(PushBasedObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PushBasedObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (PushBasedObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
