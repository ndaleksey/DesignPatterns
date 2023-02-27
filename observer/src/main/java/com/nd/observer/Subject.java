package com.nd.observer;

/**
 * @author alexey.shishkov@softline.com
 * @since 2023
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
