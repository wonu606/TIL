package com.wonu606.observerpattern.weatherstation.pullbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pullbased.subject.PullBasedWeatherData;

public class PullBasedCurrentConditionsDisplay implements PullBasedObserver, DisplayElement {

    private float temperature;
    private float humidity;

    private PullBasedWeatherData weatherData;

    public PullBasedCurrentConditionsDisplay(PullBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("PullBasedCurrentConditionsDisplay: "
                + "Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
