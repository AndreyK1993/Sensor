package app;

public class WeightObserver extends Observer {

    // Конструктор класу WeightObserver.
    // Приймає екземпляр SensorSubject (суб'єкт) для слідкування за змінами температури.
    public WeightObserver(SensorSubject sensorSubject) {
        this.sensorSubject = sensorSubject;
        this.sensorSubject.attach(this); // Приєднує WeightObserver до списку спостерігачів суб'єкта.
    }

    // Метод, який викликається суб'єктом при зміні температури.
    @Override
    public void update(int temperature) {
        // Логіка обчислення ваги речовини відповідно до умов:
        // Якщо температура менше або дорівнює 0, вага = 1 г.
        // Якщо температура більше 0, вага обчислюється за формулою 1 + 2 * temperature.
        int weight = (temperature <= 0) ? 1 : 1 + 2 * temperature;

        System.out.println("Weight: " + weight + " g");
    }
}
