package com.wonu606.observerpattern.weatherstation.pullbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pullbased.subject.PullBasedWeatherData;

public class PullBasedStatisticsDisplay implements PullBasedObserver, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;

    private int numReadings = 0;

    private PullBasedWeatherData weatherData;

    public PullBasedStatisticsDisplay(PullBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("PullBasedStatisticsDisplay"
                + "Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update() {
        numReadings++;

        float temperature = weatherData.getTemperature();
        tempSum += temperature;

        if (maxTemp > temperature) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }
}
