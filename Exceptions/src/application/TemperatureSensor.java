package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {

    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if(isOn){
            Random random = new Random();
            int minTemperature = -30;
            int maxTemperature = 30;
            return random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
        } else {
            throw new IllegalStateException("Sensor is Off. Cannot read the temperature.");
        }

    }
}
