package com.yacheli.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {
    Observable observable;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            System.out.println("[Statistics]:"+weatherData.getTemperature()+"F degrees and "+weatherData.getHumidity()+"% humidity");
        }
    }
}
