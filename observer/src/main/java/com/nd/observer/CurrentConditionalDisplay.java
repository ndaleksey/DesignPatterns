package com.nd.observer;

/**
 * @author alexey.shishkov@softline.com
 * @since 2023
 */
public class CurrentConditionalDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionalDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %fF degrees and %f humidity\n", temperature, humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
