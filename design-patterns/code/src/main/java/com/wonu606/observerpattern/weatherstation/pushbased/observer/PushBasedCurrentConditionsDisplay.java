package com.wonu606.observerpattern.weatherstation.pushbased.observer;

import com.wonu606.observerpattern.weatherstation.display.DisplayElement;
import com.wonu606.observerpattern.weatherstation.pushbased.subject.PushBasedWeatherData;

public class PushBasedCurrentConditionsDisplay implements PushBasedObserver, DisplayElement {

    private float temperature;
    private float humidity;

    private PushBasedWeatherData weatherData;

    public PushBasedCurrentConditionsDisplay(PushBasedWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("PushBasedCurrentConditionsDisplay: "
                + "Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
