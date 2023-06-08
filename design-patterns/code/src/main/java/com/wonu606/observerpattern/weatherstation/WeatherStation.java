package com.wonu606.observerpattern.weatherstation;

import com.wonu606.observerpattern.weatherstation.pullbased.observer.PullBasedCurrentConditionsDisplay;
import com.wonu606.observerpattern.weatherstation.pullbased.observer.PullBasedForecastDisplay;
import com.wonu606.observerpattern.weatherstation.pullbased.observer.PullBasedStatisticsDisplay;
import com.wonu606.observerpattern.weatherstation.pullbased.subject.PullBasedWeatherData;
import com.wonu606.observerpattern.weatherstation.pushbased.observer.PushBasedCurrentConditionsDisplay;
import com.wonu606.observerpattern.weatherstation.pushbased.observer.PushBasedForecastDisplay;
import com.wonu606.observerpattern.weatherstation.pushbased.observer.PushBasedStatisticsDisplay;
import com.wonu606.observerpattern.weatherstation.pushbased.subject.PushBasedWeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        pushBasedExample();
        pullBasedExample();
    }

    private static void pushBasedExample() {
        PushBasedWeatherData weatherData = new PushBasedWeatherData();

        PushBasedCurrentConditionsDisplay currentConditionsDisplay =
                new PushBasedCurrentConditionsDisplay(weatherData);
        PushBasedStatisticsDisplay statisticsDisplay =
                new PushBasedStatisticsDisplay(weatherData);
        PushBasedForecastDisplay forecastDisplay =
                new PushBasedForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    private static void pullBasedExample() {
        PullBasedWeatherData weatherData = new PullBasedWeatherData();

        PullBasedCurrentConditionsDisplay currentConditionsDisplay =
                new PullBasedCurrentConditionsDisplay(weatherData);
        PullBasedStatisticsDisplay statisticsDisplay =
                new PullBasedStatisticsDisplay(weatherData);
        PullBasedForecastDisplay forecastDisplay =
                new PullBasedForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
