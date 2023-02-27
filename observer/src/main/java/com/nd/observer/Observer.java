package com.nd.observer;

/**
 * @author alexey.shishkov@softline.com
 * @since 2023
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
