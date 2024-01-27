package app;

public class ColorObserver extends Observer {

    public ColorObserver(SensorSubject sensorSubject) {
        this.sensorSubject = sensorSubject;
        this.sensorSubject.attach(this);
    }

    @Override
    public void update(int temperature) {
        if (temperature <= 0) {
            System.out.println("Color: White");
        } else {
            System.out.println("Color: Black");
        }
    }
}
