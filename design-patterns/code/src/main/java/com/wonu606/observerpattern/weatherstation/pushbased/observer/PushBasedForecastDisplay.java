package com.wonu606.observerpattern.weatherstation.pushbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pushbased.subject.PushBasedWeatherData;

public class PushBasedForecastDisplay implements PushBasedObserver, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private PushBasedWeatherData weatherData;

    public PushBasedForecastDisplay(PushBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("PushBasedForecastDisplay: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
