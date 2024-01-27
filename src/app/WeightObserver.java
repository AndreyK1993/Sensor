package app;

public class WeightObserver extends Observer {

    public WeightObserver(SensorSubject sensorSubject) {
        this.sensorSubject = sensorSubject;
        this.sensorSubject.attach(this);
    }

    @Override
    public void update(int temperature) {
        int weight = (temperature <= 0) ? 1 : 1 + 2 * temperature;
        System.out.println("Weight: " + weight + " g");
    }
}
