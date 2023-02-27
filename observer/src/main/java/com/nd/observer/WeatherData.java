package com.nd.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author alexey.shishkov@softline.com
 * @since 2023
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
