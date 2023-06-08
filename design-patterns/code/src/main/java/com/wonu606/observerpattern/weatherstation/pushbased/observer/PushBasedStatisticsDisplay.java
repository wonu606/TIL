package com.wonu606.observerpattern.weatherstation.pushbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pushbased.subject.PushBasedWeatherData;

public class PushBasedStatisticsDisplay implements PushBasedObserver, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;

    private int numReadings = 0;

    private PushBasedWeatherData weatherData;

    public PushBasedStatisticsDisplay(PushBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("PushBasedStatisticsDisplay"
                + "Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;

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
