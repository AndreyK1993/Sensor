package app;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        SensorSubject sensorSubject = new SensorSubject();

        new ColorObserver(sensorSubject);
        new WeightObserver(sensorSubject);

        System.out.println("Temperature change: 5");
        sensorSubject.setTemperature(5);

        System.out.println("Temperature change: -2");
        sensorSubject.setTemperature(-2);
    }
}
