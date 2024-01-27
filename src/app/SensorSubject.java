package app;

import java.util.ArrayList;
import java.util.List;

public class SensorSubject {

    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
