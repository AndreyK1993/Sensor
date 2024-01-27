package app;

public abstract class Observer {

    protected SensorSubject sensorSubject;
    public abstract void update(int temperature);
}
