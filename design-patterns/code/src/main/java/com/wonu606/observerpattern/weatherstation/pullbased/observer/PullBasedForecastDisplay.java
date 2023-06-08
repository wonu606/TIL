package com.wonu606.observerpattern.weatherstation.pullbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pullbased.subject.PullBasedWeatherData;

public class PullBasedForecastDisplay implements PullBasedObserver, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private PullBasedWeatherData weatherData;

    public PullBasedForecastDisplay(PullBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("PullBasedForecastDisplay: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }
}
