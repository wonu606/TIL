package com.wonu606.observerpattern.weatherstation.pullbased.subject;

import com.wonu606.observerpattern.weatherstation.pullbased.observer.PullBasedObserver;
import java.util.ArrayList;
import java.util.List;

public class PullBasedWeatherData implements PullBasedSubject {

    private List<PullBasedObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public PullBasedWeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(PullBasedObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PullBasedObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (PullBasedObserver observer : observers) {
            observer.update();
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
